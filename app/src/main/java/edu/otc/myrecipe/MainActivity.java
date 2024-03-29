package edu.otc.myrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.btnPageTurn);
//        button.setOnClickListener(new MyClick());
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {

//            }
//        });

        button.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Toasty", Toast.LENGTH_LONG).show();
            Intent activity = new Intent(MainActivity.this, Recipe1.class);
            startActivity(activity);
        });
    }

    class MyClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Toast.makeText(MainActivity.this, "Toasty", Toast.LENGTH_LONG).show();
        }
    }
}