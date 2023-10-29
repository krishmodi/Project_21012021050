package com.krishmodi.project_21012021050.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.krishmodi.project_21012021050.R;

public class LoginActivity extends AppCompatActivity {
private EditText userEdit, passEdit;
private Button LoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    initView();
    
    }

    private void initView() {
        userEdit=findViewById(R.id.editTextText);
        passEdit=findViewById(R.id.editTextPassword);
        LoginBtn=findViewById(R.id.LoginBtn);
        LoginBtn.setOnClickListener(view -> {
            if (userEdit.getText().toString().isEmpty() || passEdit.getText().toString().isEmpty()){
                Toast.makeText(LoginActivity.this,"Please Fill Your User Name And Password", Toast.LENGTH_SHORT).show();
            }
            else if(userEdit.getText().toString().equals("Krish") && passEdit.getText().toString().equals("1507")){
                startActivity(new Intent(LoginActivity.this,MainActivity.class));

            }
        });
    }
}
