package com.theannguyen.kp_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<TraiCay> arrayList;
    TraiCayAdapter traiCayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.myLv);
        arrayList = new ArrayList<>();

        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));
        arrayList.add(new TraiCay(R.drawable.hinh6,"AAA","BBB"));

        traiCayAdapter = new TraiCayAdapter(arrayList,this,R.layout.trai_cay);
        gridView.setAdapter(traiCayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"" + position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_demo,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
