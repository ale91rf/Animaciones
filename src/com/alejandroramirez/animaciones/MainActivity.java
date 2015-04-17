package com.alejandroramirez.animaciones;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private Button btnCarrusel;
	private Intent i;
	private Button btnAnimacion;
	private Button btnCambio;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		getVistas();
	}

	private void getVistas() {
		btnCarrusel = (Button) findViewById(R.id.btnCarrusel);
		btnCarrusel.setOnClickListener(new OnClickListener() {
			
			

			@Override
			public void onClick(View v) {
				i = new Intent(getApplicationContext(), Carrusel.class);
				startActivity(i);
				
			}
		});
	
		
		btnAnimacion = (Button) findViewById(R.id.BtnAnimacion);
		btnAnimacion.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				i = new Intent(getApplicationContext(), Animacion.class);
				startActivity(i);
				
			}
		});
		
		btnCambio = (Button) findViewById(R.id.BtnCambio);
		btnCambio.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				i = new Intent(getApplicationContext(), CambioDeColor.class);
				startActivity(i);
				
			}
		});
		
	}


}
