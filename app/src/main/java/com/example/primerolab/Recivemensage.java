package com.example.primerolab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Recivemensage extends AppCompatActivity {
    public static final String Extra_messange="mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recivemensage);

        Intent intent = getIntent();
        String texto_mensaje = intent.getStringExtra(Extra_messange);
        TextView messageView=(TextView)findViewById(R.id.message);
        messageView.setText(texto_mensaje);
    }

}