package com.example.registracija;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    private List<Item> lista;

    public ListAdapter(List<Item> lista){
        this.lista = lista;
    }



    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.item, parent, false);
        }

        // get current item to be displayed
        Item currentItem = (Item) getItem(position);

        TextView tvName = (TextView) convertView.findViewById(R.id.textViewName);
        TextView tvLastname = (TextView) convertView.findViewById(R.id.textViewLastName);
        TextView tvMatBR = (TextView) convertView.findViewById(R.id.textViewMatBR);

        tvName.setText(currentItem.getIme());
        tvLastname.setText(currentItem.getPrezime());
        tvMatBR.setText(currentItem.getJmbg());

        return  convertView;
    }

    public void add(Item item) {
        lista.add(item);
        notifyDataSetChanged();
    }
}
