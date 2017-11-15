package com.thereza.varsity;
import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
 
@SuppressLint("NewApi")
public class DetailFragment extends Fragment {
    TextView text;
    Button buet;
    ListView list;
    ArrayList<String> data;
    ArrayAdapter<String> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
        //View view = inflater.inflate(R.layout.menu_detail_fragment, container, false);
        String menu = getArguments().getString("Menu");
        //text= (TextView) view.findViewById(R.id.detail);
        //text.setText(menu);
        if(menu.equals("Engineering")){
        	View view = inflater.inflate(R.layout.engineering, container, false);
        	 buet=(Button) view.findViewById(R.id.button1);
        	 buet.setOnClickListener(
             		new OnClickListener() {
     					
     					@Override
     					public void onClick(View v) {
     						// TODO Auto-generated method stub
     						Intent intent=new Intent(getActivity(),WebView.class);
     						intent.putExtra("item_name","buet");
     						startActivity(intent);
     						
     					}
     				});
        	 return view;
        }
        else if(menu.equals("Public")){
        	View view = inflater.inflate(R.layout.public_varsity, container, false);
        	list=(ListView) view.findViewById(R.id.public_Varsity);
            data=new ArrayList<String>();
            data.add("CUET");
            data.add("RUET");
            data.add("KUET");
            data.add("BUET");
            data.add("DUET");
            adapter=new ArrayAdapter<String>(this.getActivity(), R.layout.v_list_item,data);
            list.setAdapter(adapter);
            list.setSelector(android.R.color.holo_blue_dark);
        	 return view;
        }
        else if(menu.equals("Medical")){
        	View view = inflater.inflate(R.layout.medical, container, false);
        	 return view;
        }
        else if(menu.equals("Private")){
        	View view = inflater.inflate(R.layout.private_varsity, container, false);
        	 return view;
        }
        else if(menu.equals("National")){
        	View view = inflater.inflate(R.layout.national, container, false);
        	 return view;
        }
        else if(menu.equals("Technical")){
        	View view = inflater.inflate(R.layout.technical, container, false);
        	 return view;
        }
        else if(menu.equals("Developer")){
        	View view = inflater.inflate(R.layout.developer, container, false);
        	 return view;
        }
		return container;
       
    }
 
}