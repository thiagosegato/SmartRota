package com.example.izequiel;

import com.jwetherell.quick_response_code.CaptureActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button bt_itinerario;
	private Button bt_lerqrcode;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		bt_itinerario = (Button) findViewById(R.id.bt_itinerario);
		bt_itinerario.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, ListaItinerarios.class);
				startActivity(i);				
			}
		});
		
		bt_lerqrcode = (Button) findViewById(R.id.bt_lerqrcode);
		bt_lerqrcode.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, CaptureActivity.class);
				startActivity(i);				
			}
		});
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
