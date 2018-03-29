package com.izabela.phonearemibike;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CargarRuta extends android.support.v4.app.FragmentActivity {

	public Button btnSair;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cargar_ruta);
		
	/*	btnSair = (Button)findViewById(R.id.exit);
		Typeface font = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
		btnSair.setTypeface(font);
		btnSair.setOnClickListener(clickExit());*/
		
		
	}
	
	
	public void clickBici(View v){
		Intent i1 = new Intent(this, PatallaInicial.class);
		startActivity(i1);
	}
	
	public void clickGrabar(View v){
		Intent i1 = new Intent(this, GrabarRuta.class);
		startActivity(i1);
	}
	
	public void clickAntiRobo(View v){
		Intent i3 = new Intent(this, AntiRobo.class);
		startActivity(i3);
	}

	
	
	public void clickConf(View v){
		Intent i3 = new Intent(this, Bicicleta.class);
		startActivity(i3);
	}
	
	/*
	public void clickBici(View v){
		Intent i = new Intent(this, Bicicleta.class);
		startActivity(i);
	}
	
	public void clickBack(View v){
		Intent i1 = new Intent(this, PatallaInicial.class);
		startActivity(i1);
	}
	
	public void clickGrabar(View v){
		Intent i2 = new Intent(this, GrabarRuta.class);
		startActivity(i2);
	}
	
	public void clickAntiRobo(View v){
		Intent i3 = new Intent(this, AntiRobo.class);
		startActivity(i3);
	}
	
	public View.OnClickListener clickExit() {
		return new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_HOME);
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
			}
		};
	}
	
	*/
	
}
