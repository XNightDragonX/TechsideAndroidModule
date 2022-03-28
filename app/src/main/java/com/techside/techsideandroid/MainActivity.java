package com.techside.techsideandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    ListView listprod;
    ListViewAdapter adapter;
    SearchView editsearch;
    String[] productnamelist;
    ArrayList<Productnames> arraylistprod = new ArrayList<Productnames>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Listadeproductos
        productnamelist = new String[]{"cloro", ""/*,"insetar mas productos"*/};

        // Encuentra en el xml buscador
        list = (ListView) findViewById(R.id.buscador);

        for (int i = 0; i < productnamelist.length; i++) {
            Productnames ProductNames = new Productnames(productnamelist[i]);
            // Ingresa todos los datos en la lista
            arraylistprod.add(ProductNames);
        }

        // Pasa los resultados al adapter
        adapter = new ListViewAdapter(this, arraylistprod);

        // Pasa el adapter a la lista
        list.setAdapter(adapter);

        // encuentra el buscador y ingresa datos
        editsearch = (SearchView) findViewById(R.id.buscador);
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
}









