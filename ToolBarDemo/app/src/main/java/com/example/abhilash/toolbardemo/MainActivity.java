package com.example.abhilash.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.item1_id :
                Toast.makeText(getApplicationContext() ,"settings" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2_id:
                Toast.makeText(getApplicationContext() ,"close" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.search_id:
                Toast.makeText(getApplicationContext() , "search" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.cart_id:
                Toast.makeText(getApplicationContext() , "cart" , Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                finish();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
