package com.example.challengepraktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email, password;
        Button signin;

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myemail,mypassword;
                myemail = email.getText().toString();
                mypassword = password.getText().toString();
                if (myemail.isEmpty() || mypassword.isEmpty()){
                    Toast.makeText(MainActivity.this, "Email dan Password anda tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
                else if (!myemail.equals("myemail@gmail.com")){
                    Toast.makeText(MainActivity.this, "Email yang anda masukkan tidak terdaftar", Toast.LENGTH_SHORT).show();
                }
                else if (!mypassword.equals("12345")){
                    Toast.makeText(MainActivity.this, "Password yang anda masukkan salah", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, emailbox.class);
                    intent.putExtra("email_key",myemail);
                    intent.putExtra("password_key",mypassword);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Anda berhasil Login", Toast.LENGTH_SHORT).show();


                }

            }
        });
    }
}