package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView surveyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surveyListView = findViewById(R.id.surveyListView);

        List<questions> q = generatequestions();
        questionadapter adapter = new questionadapter(this, q);
        surveyListView.setAdapter(adapter);
    }

    private List<questions> generatequestions() {
        List<questions> q = new ArrayList<>();
        q.add(new questions("cardview"));
        q.add(new questions("cardview"));
        q.add(new questions("cardview"));
        return q;
    }
}