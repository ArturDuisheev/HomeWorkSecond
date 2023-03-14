package com.example.homeworkthreemonthchaptertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.homeworkthreemonthchaptertwo.databinding.ActivityFinalBinding;

import org.w3c.dom.Text;

public class FinalActivity extends AppCompatActivity {


    private TextView NameTextView;
    private TextView FhaterTextView;
    private TextView SurnametTextView;
    private TextView AgeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        NameTextView = findViewById(R.id.textViewMenu);
        SurnametTextView = findViewById(R.id.textViewMenuTwo);
        FhaterTextView = findViewById(R.id.textViewThree);
        AgeTextView = findViewById(R.id.textViewFour);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String father_name = getIntent().getStringExtra("fhatername");
        String age = getIntent().getStringExtra("age");

        String name_var = name;
        String surname_var = surname;
        String father_name_var = father_name;
        String age_var = age;

        NameTextView.setText(name_var);
        SurnametTextView.setText(surname_var);
        FhaterTextView.setText(father_name_var);
        AgeTextView.setText(age_var);
    }
}