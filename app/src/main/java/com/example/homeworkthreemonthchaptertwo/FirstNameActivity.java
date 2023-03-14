package com.example.homeworkthreemonthchaptertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstNameActivity extends AppCompatActivity {

    private EditText surnameEditText;
    private Button nextButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_name);

        String name = getIntent().getStringExtra("name");

        surnameEditText = findViewById(R.id.surname_edit_text);
        nextButton = findViewById(R.id.next_btn_surname);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String surname = surnameEditText.getText().toString();
                Intent intent = new Intent(FirstNameActivity.this, FhaterNameActivity.class);
                intent.putExtra("surname", surname);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }
}