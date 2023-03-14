package com.example.homeworkthreemonthchaptertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FhaterNameActivity extends AppCompatActivity {

    private EditText fhaternameEditText;
    private Button nextButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fhater_name);

        String fhatername = getIntent().getStringExtra("fhatername");
        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");

        fhaternameEditText = findViewById(R.id.father_name_edit_text);
        nextButton = findViewById(R.id.next_btn_fhater_name);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fhatername = fhaternameEditText.getText().toString();
                Intent intent = new Intent(FhaterNameActivity.this, AgeActivity.class);
                intent.putExtra("fhatername", fhatername);
                intent.putExtra("name", name);
                intent.putExtra("surname", surname);
                startActivity(intent);
            }
        });
    }
}
