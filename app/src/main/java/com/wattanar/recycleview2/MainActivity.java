package com.wattanar.recycleview2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // this is data fro recycler view
        ItemData itemsData[] = { new ItemData("Help",R.drawable.kola),
                new ItemData("Delete",R.drawable.kola),
                new ItemData("Cloud",R.drawable.kola),
                new ItemData("Favorite",R.drawable.kola),
                new ItemData("Like",R.drawable.kola),
                new ItemData("Delete",R.drawable.kola),
                new ItemData("Cloud",R.drawable.kola),
                new ItemData("Favorite",R.drawable.kola),
                new ItemData("Like",R.drawable.kola),
                new ItemData("Delete",R.drawable.kola),
                new ItemData("Cloud",R.drawable.kola),
                new ItemData("Favorite",R.drawable.kola),
                new ItemData("Like",R.drawable.kola),
                new ItemData("Delete",R.drawable.kola),
                new ItemData("Cloud",R.drawable.kola),
                new ItemData("Favorite",R.drawable.kola),
                new ItemData("Like",R.drawable.kola),
                new ItemData("Delete",R.drawable.kola),
                new ItemData("Cloud",R.drawable.kola),
                new ItemData("Favorite",R.drawable.kola),
                new ItemData("Like",R.drawable.kola),
                new ItemData("Rating",R.drawable.kola)
        };


        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. create an adapter
        MyAdapter mAdapter = new MyAdapter(itemsData);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

//        recyclerView.addOnItemTouchListener()
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
