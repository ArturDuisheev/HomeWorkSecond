package com.example.homeworkthreemonthchaptertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {

    private EditText ageEditText;
    private Button nextButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        String fhatername = getIntent().getStringExtra("fhatername");
        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String age = getIntent().getStringExtra("age");

        ageEditText = findViewById(R.id.age_edit_text);
        nextButton = findViewById(R.id.next_btn_fhater_name);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String age = ageEditText.getText().toString();
                Intent intent = new Intent(AgeActivity.this, FinalActivity.class);
                intent.putExtra("fhatername", fhatername);
                intent.putExtra("name", name);
                intent.putExtra("surname", surname);
                intent.putExtra("age", age);
                startActivity(intent);
            }
        });
    }
}