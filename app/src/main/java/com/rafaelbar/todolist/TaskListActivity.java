package com.rafaelbar.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class TaskListActivity extends AppCompatActivity {
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        String arr[] = {"Task1", "Task2", "Task3", "Task4", "Task5"};
        l = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, arr);
        l.setAdapter(adapter);
    }

    public void goToCreate(View v){
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), CreateTaskActivity.class));
    }
}


