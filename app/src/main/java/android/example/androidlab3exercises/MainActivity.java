package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBai1, btnBai2, btnBai3, btnBai4, btnBai5, btnBai6, btnBai7, btnBai8, btnBai9, btnBai10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    void addControl()
    {
        btnBai1 = (Button) findViewById(R.id.btnBai1);
        btnBai2 = (Button) findViewById(R.id.btnBai2);
        btnBai3 = (Button) findViewById(R.id.btnBai3);
        btnBai4 = (Button) findViewById(R.id.btnBai4);
        btnBai5 = (Button) findViewById(R.id.btnBai5);
        btnBai6 = (Button) findViewById(R.id.btnBai6);
        btnBai7 = (Button) findViewById(R.id.btnBai7);
        btnBai8 = (Button) findViewById(R.id.btnBai8);
        btnBai9 = (Button) findViewById(R.id.btnBai9);
        btnBai10 = (Button) findViewById(R.id.btnBai10);
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
        moveToActivity(btnBai1, ActivityLab3Bai1.class);
        moveToActivity(btnBai2, ActivityLab3Bai2.class);
        moveToActivity(btnBai3, ActivityLab3Bai3.class);
        moveToActivity(btnBai4, ActivityLab3Bai4.class);
        moveToActivity(btnBai5, ActivityLab3bai5.class);
    }
}