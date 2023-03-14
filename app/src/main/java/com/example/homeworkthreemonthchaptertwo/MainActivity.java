package com.example.homeworkthreemonthchaptertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;

    private Arrays result;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.first_name_edit_text);
        nextButton = findViewById(R.id.next_btn_name);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, FirstNameActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }
}