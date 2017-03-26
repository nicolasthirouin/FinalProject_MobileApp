package fr.esilv.s8.td6_project.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import fr.esilv.s8.td6_project.R;


/**
 * Created by TRN on 22/03/2017.
 */

public class SearchActivity extends AppCompatActivity {
    private Button click;
    private EditText editText;
    private int REQUEST_CODE = 1;
    private static final String SEARCH = "SEARCH";
    private static String search;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        final Context context = this;
        editText = (EditText) findViewById(R.id.et_query);
        click = (Button) findViewById(R.id.click);

        click .setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                ResultActivity.start(context, editText.getText().toString());
            }
        });


    }






}