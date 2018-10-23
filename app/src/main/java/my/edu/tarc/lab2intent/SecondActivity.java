package my.edu.tarc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textViewMsg;
        textViewMsg=findViewById(R.id.textViewMessage);
        Intent intent=getIntent();
        if(intent.hasExtra(MainActivity.TAG_MESSAGE)){
            String stringMsg;
            stringMsg=intent.getStringExtra(MainActivity.TAG_MESSAGE);
            textViewMsg.setText(stringMsg);
        }
        ImageView imageView;
        imageView=findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.normal);
    }
}
