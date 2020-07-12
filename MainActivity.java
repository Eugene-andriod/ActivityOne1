package com.example.activityone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG= "My First Application";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Wire the button to do stuff
        // ...get the button
            Button btn = (Button) findViewById(R.id.greet);
        //...set what happens when the user clicks
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Hello Mpumelelo Magagula");
                Toast.makeText(getApplicationContext(), "hello Magagula Mpumelelo!", Toast.LENGTH_LONG).show();

                //setting the app bars



            }
        });

    }

}