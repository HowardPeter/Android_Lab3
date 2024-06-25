package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBai12, btnBai3, btnBai4, btnBai5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    void addControl()
    {
        btnBai12 = (Button) findViewById(R.id.btnBai1);
        btnBai3 = (Button) findViewById(R.id.btnBai3);
        btnBai4 = (Button) findViewById(R.id.btnBai4);
        btnBai5 = (Button) findViewById(R.id.btnBai5);
    }

    private void moveToActivity(Button button, final Class<? extends Activity> targetActivity)
    {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, targetActivity);
                startActivity(intent);
            }
        });
    }

    void addEvent()
    {
//        moveToActivity(btnBai12, ActivityLab3Bai1.class);
//        moveToActivity(btnBai3, ActivityLab2Bai3.class);
//        moveToActivity(btnBai4, Activity1Lab2Bai4.class);
//        moveToActivity(btnBai5, ActivityLab2Bai5.class);
    }
}