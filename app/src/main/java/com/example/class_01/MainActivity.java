package com.example.class_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText emailText,passwordText;
    private Button loginBtn,registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailText = findViewById(R.id.emailTextId);
        passwordText = findViewById(R.id.passwordTextId);

        loginBtn =findViewById(R.id.loginButtonId);
        registerBtn = findViewById(R.id.createAccountId);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!emailText.getText().toString().isEmpty() && emailText.getText().toString().equals("example@gmail.com")
                        && !passwordText.getText().toString().isEmpty() && passwordText.getText().toString().equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, Welcome.class);
                    startActivity(intent);
                    finish();
                }
            }

        });
    }

}
