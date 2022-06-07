package com.harsha.todoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button loginBtn;
    private Button regstrBtn;


    private EditText task_name;
    private Button add_task_btn;
    private ListView tsklst;

    private ArrayList<String> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.hloginintentbtn);
        regstrBtn = findViewById(R.id.hregintentbtn);
        task_name = findViewById(R.id.taskname);
        add_task_btn = findViewById(R.id.addtsk_btn);
        tsklst = findViewById(R.id.item_list_view);

        tasks = new ArrayList<String>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, tasks);
        tsklst.setAdapter(adapter);


        add_task_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String task = task_name.getText().toString();
                tasks.add(task);
                tsklst.setAdapter(adapter);
            }
        });

    }
}

