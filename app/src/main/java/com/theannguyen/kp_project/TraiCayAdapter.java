package com.theannguyen.kp_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

public class TraiCayAdapter extends BaseAdapter {
    List<TraiCay> traiCayList;
    Context context;
    int layout;

    public TraiCayAdapter(List<TraiCay> traiCayList, Context context, int layout) {
        this.traiCayList = traiCayList;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return traiCayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    class ViewHolder{
        ImageView imageView;
        TextView textViewName,textViewMoTa;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(layout,null);

            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageTraiCay);
            viewHolder.textViewMoTa = (TextView) convertView.findViewById(R.id.textMoTa);
            viewHolder.textViewName = (TextView) convertView.findViewById(R.id.textName);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        TraiCay traiCay = traiCayList.get(position);
        viewHolder.imageView.setImageResource(traiCay.getImageTraiCay());
        viewHolder.textViewMoTa.setText(traiCay.getTextMoTa());
        viewHolder.textViewName.setText(traiCay.getTextName());

        return convertView;
    }
}
