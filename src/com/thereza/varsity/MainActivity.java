package com.thereza.varsity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
 
@SuppressLint("NewApi")
public class MainActivity extends Activity {
         String[] menu;
         DrawerLayout dLayout;
         ListView dList;
         ArrayAdapter<String> adapter;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
           int[] image={R.drawable.ic_home,R.drawable.ic_launcher,R.drawable.ic_communities,R.drawable.ic_people,R.drawable.logo};
            menu = new String[]{"Engineering","Public","Medical","Private","National","Technical","Developer"};
            dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            
            dList = (ListView) findViewById(R.id.left_drawer);
            dLayout.openDrawer(dList);
            adapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.itemName,menu);
 
            dList.setAdapter(adapter);
            dList.setSelector(android.R.color.holo_blue_dark);
 
            dList.setOnItemClickListener(new OnItemClickListener(){
 
                @Override
                public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
 
                    dLayout.closeDrawers();
                    Bundle args = new Bundle();
                    args.putString("Menu", menu[position]);
                    Fragment detail = new DetailFragment();
                    detail.setArguments(args);
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.content_frame, detail).commit();
 
                }
 
            });
    }
 
 
 
}