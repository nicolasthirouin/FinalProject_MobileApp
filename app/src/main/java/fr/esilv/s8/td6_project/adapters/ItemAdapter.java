package fr.esilv.s8.td6_project.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import fr.esilv.s8.td6_project.interfaces.OnItemSelectedListener;
import fr.esilv.s8.td6_project.models.Item;
import fr.esilv.s8.td6_project.viewholders.ItemViewHolder;
import fr.esilv.s8.td6_project.viewholders.OnVideoSelectedListener;
import fr.esilv.s8.td6_project.R;


/**
 * Created by TRN on 22/03/2017.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder>{

    private final List<Item> items;
    private OnItemSelectedListener onItemSelectedListener;

    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.setOnVideoSelectedListener((OnVideoSelectedListener) onItemSelectedListener);
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }
}
