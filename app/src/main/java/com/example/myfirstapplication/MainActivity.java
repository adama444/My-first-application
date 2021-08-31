package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String INTENT_KEY_INPUT_TEXT = "input text";
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.main_button);
        editText = findViewById(R.id.main_edit_text);
        button.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == button.getId()) {
            String inputText = editText.getText().toString();
            if (isInputFieldEmpty(inputText)) {
                Toast.makeText(this, "The field does not be empty",
                        Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, DetailsActivity.class);
                intent.putExtra(INTENT_KEY_INPUT_TEXT, inputText);
                startActivity(intent);
            }
        }
    }

    private boolean isInputFieldEmpty(String inputText) {
        if (inputText.equals("")) {
            return true;
        } else if (inputText.equals(" ")) {
            return true;
        } else {
            return false;
        }
    }
}