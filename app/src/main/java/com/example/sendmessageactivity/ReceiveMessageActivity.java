package com.example.sendmessageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String Extra_Message="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent=getIntent();
        String messageSent=intent.getStringExtra(Extra_Message);
        TextView messageReceive=(TextView) findViewById(R.id.receiveMessage);
        messageReceive.setText(messageSent);
    }
}