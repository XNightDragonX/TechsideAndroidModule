package com.techside.techsideandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class ListViewAdapter implements ListAdapter {
    Context mContext;
    LayoutInflater inflater;
    private List<Productnames> productnamelist = null;
    private ArrayList<Productnames> arraylist;

    public ListViewAdapter(Context context, String[] productNameList) {
        mContext = context;
        this.ProductNameList = ProductNameList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<ProductNames>();
        this.arraylist.addAll(ProductNamesList);
    }
}
