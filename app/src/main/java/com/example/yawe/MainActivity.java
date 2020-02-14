package com.example.yawe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void sendMesaage (View view){
        EditText message = (EditText)findViewById(R.id.edit_message);
        Toast.makeText(this, "sending Message" +message.getText().toString(),Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("Message",message.getText().toString());
        startActivity(intent);

        message.setText("");
    }
}
