package com.example.sendmessageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText messageGiven=(EditText) findViewById(R.id.senderMessage);
        String messageSend=messageGiven.getText().toString();
        Intent intent=new Intent(this,ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.Extra_Message,messageSend);
        startActivity(intent);
    }
}