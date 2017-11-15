package com.thereza.varsity;

import android.app.Activity;
import android.widget.ArrayAdapter;

public class CustomListAdapter extends ArrayAdapter<String> {

	private final Activity contex;
	private final String[] itemname;
	private final Integer[] image;
	
	public CustomListAdapter(Activity context, String[] itemname,Integer[] image) {
		super(context, R.layout.list_item,itemname);
		this.contex=context;
		this.itemname=itemname;
		this.image=image;
	}

}
