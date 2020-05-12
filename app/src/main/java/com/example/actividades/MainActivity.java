package com.example.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void acercaDe(View view){
      Intent intent = new Intent(this,AcercaDeActivity.class);
      startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getBaseContext(),"onCreate()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getBaseContext(),"onStart()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(),"onResume()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getBaseContext(),"onPause()",Toast.LENGTH_SHORT).show();
        Log.e("mensaje","onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getBaseContext(),"onStop()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getBaseContext(),"onRestart()",Toast.LENGTH_SHORT).show();
    }
}
