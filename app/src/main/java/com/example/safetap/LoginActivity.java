package com.example.safetap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonLogin;
    private Button buttonSignUp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser ();
            }
        });

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpActivity();
            }
        });
    }

    private void loginUser () {
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        // Here you would typically validate the input and perform the login operation
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        } else {
            // Perform login logic (e.g., authenticate with a server)
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
            // Navigate to the main activity
            // Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            // startActivity(intent);
        }
    }

    private void openSignUpActivity() {
        Intent intent = new Intent(LoginActivity.this, com.example.safetap.SignUpActivity.class);
        startActivity(intent);
    }
}