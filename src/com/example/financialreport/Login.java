package com.example.financialreport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity{

	
	private String adminUsername = "admin";
	private String adminPw = "pass123";
	private Button loginB;
	private EditText inputUn;
	private EditText inputPw;
	private TextView warning;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		loginB = (Button) findViewById(R.id.loginbutton);
		inputUn = (EditText) findViewById(R.id.usernameLog);
		inputPw = (EditText) findViewById(R.id.passwordLog);
		warning = (TextView) findViewById(R.id.loginText);
		loginB.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				 if(inputUn.getText().toString().equals("") || inputPw.getText().toString().equals("")){
					 warning.setText("Username and Password cannot be empty.");
				 }
				 else if(inputUn.getText().toString().equals(adminUsername) &&
					inputPw.getText().toString().equals(adminPw)){
					Intent mainpage = new Intent("com.example.financialreport.MAINPAGE");
					startActivity(mainpage);
				} else {
					warning.setText("Your username or password is not valid, please try again.");
				}
			}
			
		});
	}

    
}
