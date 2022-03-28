package com.techside.techsideandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends adapter {
    Context mContext;
    LayoutInflater inflater;
    private List<Productnames> productnamelist = null;
    private ArrayList<Productnames> arraylist;

    public ListViewAdapter(Context context, ArrayList<Productnames> ProductNameList) {
        mContext = context;
        this.ProductNameList = ProductNameList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<ProductNames>();
        this.arraylist.addAll(ProductNamesList);
    }
}
