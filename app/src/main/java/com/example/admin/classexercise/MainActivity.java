package com.example.admin.classexercise;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    private final static String NAME="name";
    private final static String CLASSES="classes";
    private final static String NUMBER="number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names={"张三","李四","王五"};
        String[] classess={"1班","2班","3班"};
        String[] numbers={"001","002","003"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME,names[i]);
            item.put(CLASSES,classess[i]);
            item.put(NUMBER,numbers[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(
                this,
                items,
                R.layout.item,
                new String[] {NAME,CLASSES,NUMBER},
                new int[] {R.id.txtName,R.id.txtClasses,R.id.txtNumber}
        );
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
