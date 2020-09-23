package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name, age;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button breturn = findViewById(R.id.returnB);

        TextView tView = findViewById(R.id.textView);
        TextView tView2 = findViewById(R.id.textView2);

        Bundle nPage = getIntent().getExtras();

        String textV = nPage.getString("name");
        String textV2 = nPage.getString("age");

        tView.setText(textV);
        tView2.setText(textV2);

        breturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);

                startActivity(intent);

            }
        });

    }
}