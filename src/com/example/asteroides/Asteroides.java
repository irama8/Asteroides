package com.example.asteroides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroides extends Activity {
	private Button bAcercaDe;
	private Button bSalir;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		 bAcercaDe =(Button) findViewById(R.id.button1);
		 bSalir =(Button) findViewById(R.id.button2);

	        bAcercaDe.setOnClickListener(new OnClickListener() {
	                   public void onClick(View view) {
	                        lanzarAcercaDe(null);
	                  }
	            });
	        
	        bSalir.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                	salir(null);
                }
	        }); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.asteroides, menu);
		return true;
	}

	public void lanzarAcercaDe(View view) {
		Intent i = new Intent(this, AcercaDe.class);
		startActivity(i);

	}
	
	public void salir(View view){
		finish();
	}
	
	

}
