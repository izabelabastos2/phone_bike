package com.izabela.phonearemibike;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GrabarRuta extends android.support.v4.app.FragmentActivity{

	public Button btnSair;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grabar_ruta);
		
	/*	btnSair = (Button)findViewById(R.id.exit);
		Typeface font = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
		btnSair.setTypeface(font);
		btnSair.setOnClickListener(clickExit());*/
	}
	
	
	public void clickBici(View v){
		Intent i1 = new Intent(this, PatallaInicial.class);
		startActivity(i1);
	}
	
/*	public void clickGrabar(View v){
		Intent i1 = new Intent(this, GrabarRuta.class);
		startActivity(i1);
	}
	*/
	public void clickCarga(View v){
		Intent i2 = new Intent(this, CargarRuta.class);
		startActivity(i2);
	}
	
	public void clickAntiRobo(View v){
		Intent i3 = new Intent(this, AntiRobo.class);
		startActivity(i3);
	}
}

