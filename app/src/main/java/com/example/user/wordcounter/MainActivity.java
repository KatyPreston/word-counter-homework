package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView answerText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);
        answerText = findViewById(R.id.answer_text);
        countButton = findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View view){
        Log.d(getClass().toString(), "Yo");
        String text = editText.getText().toString();

        WordCounter wordCounter = new WordCounter();
        int answer = wordCounter.countWords(text);

        answerText.setText(Integer.toString(answer));

    }


}
