package com.aditya.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;





public class MainActivity extends AppCompatActivity {
    EditText edtnpm ;
    EditText edtnama ;
    Button btnsend ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnpm = (EditText) findViewById(R.id.edtnama) ;
        edtnama = (EditText) findViewById(R.id.edtnpm) ;
        btnsend = (Button) findViewById(R.id.btnsend) ;

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data = edtnpm.getText().toString();
                String datax = edtnama.getText().toString();

                Intent next = new Intent(MainActivity.this,halaman2.class);
                next.putExtra("data",data);
                next.putExtra("datax",datax);
                startActivity(next);
                finish();



            }
        });
    }
}

