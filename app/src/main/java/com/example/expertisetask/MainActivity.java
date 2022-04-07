package com.example.expertisetask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    final String TAG = "LoginActivity";
    EditText usernameInput;
    EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        Button loginButton = findViewById(R.id.buttonLogin);
        usernameInput = findViewById(R.id.usernameInput);
        passwordInput =  findViewById(R.id.passwordInput);


        loginButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(Patterns.EMAIL_ADDRESS.matcher(usernameInput.getText().toString()).matches())
                {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }

                else
                {

                    Toast.makeText(MainActivity.this, "Please Enter a valid Email ID", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}