package com.theannguyen.kp_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class StudentAdapter extends BaseAdapter {

    private int layout;
    private Context context;
    private ArrayList<Student> arrayList;

    public StudentAdapter(int layout, Context context, ArrayList<Student> arrayList) {
        this.layout = layout;
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(layout,null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageD);
        TextView textName = (TextView) convertView.findViewById(R.id.textName);
        TextView textAge = (TextView) convertView.findViewById(R.id.textAge);

        Student student = arrayList.get(position);

        imageView.setImageResource(student.getImage());
        textAge.setText(student.getAge()+"");
        textName.setText(student.getName());

        return convertView;
    }
}
