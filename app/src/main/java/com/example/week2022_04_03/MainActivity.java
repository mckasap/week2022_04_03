package com.example.week2022_04_03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button);
        registerForContextMenu(b);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.item1:
                Toast.makeText(MainActivity.this,item.getTitle().toString() +" 1",Toast.LENGTH_LONG).show(); break;
            case R.id.item2:
                Toast.makeText(MainActivity.this,item.getTitle().toString() +" 2",Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Toast.makeText(MainActivity.this,item.getTitle().toString() +" 3",Toast.LENGTH_LONG).show();
                break;
            case R.id.item4:
                Toast.makeText(MainActivity.this,item.getTitle().toString() +" 4",Toast.LENGTH_LONG).show();
                break;


        }


        return super.onContextItemSelected(item);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu,
                                    View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inf= getMenuInflater();
        inf.inflate(R.menu.menucontext,menu);

    }
}