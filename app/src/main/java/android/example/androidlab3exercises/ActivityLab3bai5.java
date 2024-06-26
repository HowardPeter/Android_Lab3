package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class ActivityLab3bai5 extends AppCompatActivity {
    Spinner spLanguage;
    CustomLanguageAdapter adapter;
    ArrayList<Language> arrayList = new ArrayList<>();

    String[] languages = {"C# Language", "HTML Language", "XML Language", "PHP Language"};
    int[] images = {R.drawable.csharp, R.drawable.html, R.drawable.xml, R.drawable.php};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3bai5);
        spLanguage = (Spinner) findViewById(R.id.spLanguage);
        arrayList = Language.initData(images, languages);
        adapter = new CustomLanguageAdapter(this, R.layout.layout_language, arrayList);
        spLanguage.setAdapter(adapter);
    }

}