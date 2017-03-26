package fr.esilv.s8.td6_project.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import fr.esilv.s8.td6_project.Constants;
import fr.esilv.s8.td6_project.R;
import fr.esilv.s8.td6_project.adapters.ItemAdapter;
import fr.esilv.s8.td6_project.models.Example;
import fr.esilv.s8.td6_project.models.Item;

/**
 * Created by TRN on 22/03/2017.
 */

public class ResultActivity extends AppCompatActivity {
    private static final String VIDEOS_URL = "https://www.googleapis.com/youtube/v3/search?key="
            + Constants.API_KEY + "&q=actor" + "&part=snippet";
    private RecyclerView recyclerView;
    private static final String SEARCH = "SEARCH";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private static String search;
    public static void start(Context context, String search){
        Intent intent = new Intent(context, SearchActivity.class);
    intent.putExtra(SEARCH, search);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        search = getIntent().getStringExtra(SEARCH);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getResult();

    }

    private void getResult() {
        StringRequest stationsRequest = new StringRequest(VIDEOS_URL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Example example = new Gson().fromJson(VIDEOS_URL, Example.class);
                setAdapter(example.getItems());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("videoList", "Error");
            }
        });
        Volley.newRequestQueue(this).add(stationsRequest);
    }

    private void setAdapter(ArrayList<Item> item) {
        ItemAdapter adapter = new ItemAdapter((List<Item>) item);
        recyclerView.setAdapter(adapter);
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Result Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}