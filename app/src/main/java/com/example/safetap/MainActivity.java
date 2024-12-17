package com.example.safetap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonLogin;
    private Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.button);
        buttonSignUp = findViewById(R.id.button2);

        // Set OnClickListener for the Login button
        Button loginButton = findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openLoginActivity();
            }
        });

        // Set OnClickListener for the Sign Up button
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpActivity();
            }
        });
    }

    private void openLoginActivity() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    private void openSignUpActivity() {
        Intent intent = new Intent(MainActivity.this, com.example.safetap.SignUpActivity.class);
        startActivity(intent);
    }

    private class LoginActivity {
    }
}