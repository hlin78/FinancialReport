package com.example.financialreport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Welcome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome_screen);
		
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
				} catch (Exception e){
					e.printStackTrace();
				} finally{
					Intent openMainActivity = new Intent("com.example.financialreport.MAINACTIVITY");
					startActivity(openMainActivity);
				}
			}
		};
		
		timer.start();
		
	}

	

}
