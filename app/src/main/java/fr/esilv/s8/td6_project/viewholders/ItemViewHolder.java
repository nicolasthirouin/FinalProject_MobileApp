package fr.esilv.s8.td6_project.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import fr.esilv.s8.td6_project.R;
import fr.esilv.s8.td6_project.models.Item;

public class ItemViewHolder extends RecyclerView.ViewHolder {


    private TextView title;
    private TextView desc;
    private TextView author;
    private ImageView thumbnail;
    private OnVideoSelectedListener onVideoSelectedListener;

    public ItemViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        desc = (TextView) itemView.findViewById(R.id.desc);
        author = (TextView) itemView.findViewById(R.id.author);
        thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);

    }

    public void bind(final Item videoList) {
        title.setText(videoList.getSnippet().getTitle());
        desc.setText(videoList.getSnippet().getDescription().toString());
        author.setText(videoList.getSnippet().getChannelTitle());
        Glide.with(itemView.getContext()).load(videoList.getSnippet().getThumbnails().getMedium().getUrl()).override(1200,400).into(thumbnail);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onVideoSelectedListener == null) {
                    return;
                }
                onVideoSelectedListener.onItemSelected(videoList);
            }
        });
    }

    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener) {
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}
