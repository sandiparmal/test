package com.pratik.adapters;

import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pratik.ministersofindia.R;

public class DynamicListAdapter extends ArrayAdapter<String> {

	String[] secondvalues;
	String[] mainvalues;
	private final Activity context;

	static class ViewHolder {
		public TextView smalltext;
		public TextView bigText;
		public ImageView image;
	}

	public DynamicListAdapter(Activity context, String[] objects,String[] mainvalues) {
		super(context, R.layout.list_item_layout, objects);
		this.secondvalues = objects;
		this.context = context;
		this.mainvalues = mainvalues;
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}

	/*@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View rowView = convertView;
		if (rowView == null) {
			LayoutInflater inflater = context.getLayoutInflater();
			rowView = inflater.inflate(R.layout.list_item_layout, null);
			ViewHolder viewHolder = new ViewHolder();
			viewHolder.smalltext = (TextView) rowView.findViewById(R.id.secondLine);
			viewHolder.bigText = (TextView) rowView.findViewById(R.id.smallLine);
			viewHolder.image = (ImageView) rowView.findViewById(R.id.icon);
			rowView.setTag(viewHolder);
		}

		ViewHolder holder = (ViewHolder) rowView.getTag();
		String s = secondvalues[position];
		String s1 = mainvalues[position];
		Log.i("TEST ADAPTER ","s and s1 "+s+" "+s1);
		//holder.smalltext.setText(s);
		//holder.bigText.setText(s);

		return rowView;
	}*/

}
