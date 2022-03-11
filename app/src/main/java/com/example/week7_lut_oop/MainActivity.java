package com.example.week7_lut_oop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView text_task2;
    TextView text_task3;
    TextView text_task4;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text_task2 = (TextView) findViewById(R.id.textView2);
        text_task3 = (TextView) findViewById(R.id.textView3);
        text_task4 = (TextView) findViewById(R.id.textView4);
        editText = (EditText) findViewById(R.id.editText);


        // source for the function below:
        // https://stackoverflow.com/questions/1489852/android-handle-enter-in-an-edittext/6832095#6832095

        editText.setOnKeyListener(new View.OnKeyListener()
        {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    text_task4.setText(editText.getText());
                    return true;
                }
                return false;
            }
        });
    }


    public void changeText (View v)
    {
        System.out.println("Hello World!");
        text_task2.setText("Hello World!");
        text_task3.setText(editText.getText());

    }
}