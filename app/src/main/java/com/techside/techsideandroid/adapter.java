package com.techside.techsideandroid;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter implements ListAdapter {
    Context mContext;
    LayoutInflater inflater;
    private List<productnames> productnamelist = null;
    private ArrayList<productnames> arraylist;

    public ListViewAdapter(Context context, String[] productnameList) {
        mContext = context;
        this.productnamelist = productnamelist;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<productnames>();
        this.arraylist.addAll(productnamelist);
    }
}
