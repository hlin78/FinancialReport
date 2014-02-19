package com.example.financialreport;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends Activity {
	
	private EditText inputUsername;
	private EditText inputPassword;
	private Button register;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		
		inputUsername = (EditText) findViewById(R.id.username_edit);
		inputPassword = (EditText) findViewById(R.id.password_edit);
		register = (Button) findViewById(R.id.register_button);
		
		register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});
		
	}
}
