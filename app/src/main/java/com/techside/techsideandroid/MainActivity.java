package com.techside.techsideandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    // Programacion de el buscador
    ListView listprod;
    ListViewAdapter adapter;
    SearchView editsearch;
    String[] productnamelist;
    ArrayList<productnames> arraylistprod = new ArrayList<productnames>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Listadeproductos
        productnamelist = new String[]{"cloro", ""/*,"insetar mas productos"*/};

        // Encuentra en el xml buscador
        listprod = (ListView) findViewById(R.id.listprod);

        for (int i = 0; i < productnamelist.length; i++) {
            productnames ProductNames = new productnames(productnamelist[i]);
            // Ingresa todos los datos en la arraylist
            arraylistprod.add(ProductNames);
        }

        // Pasa los resultados al adapter
        adapter = new ListViewAdapter(this, productnamelist);

        // Pasa el adapter a la lista
        listprod.setAdapter(adapter);

        // encuentra el buscador en el xml y ingresa datos
        editsearch = (SearchView) findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        String text = newText;
        adapter.filter(text);
        return false;
    }

    private class productnames {
        public productnames(String s) {
        }
    }

    private class ArrayList<T> {
        public void add(T productNames) {
        }
    }
}









