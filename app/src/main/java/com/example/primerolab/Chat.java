package com.example.primerolab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.message);
        String texto_mensaje = messageView.getText().toString();
        Intent intent = new Intent(this,Recivemensage.class);
        intent.putExtra("message",texto_mensaje);
        startActivity(intent);
    }


}