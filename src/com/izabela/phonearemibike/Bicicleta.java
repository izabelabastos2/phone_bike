package com.izabela.phonearemibike;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Bicicleta extends Activity {

	
	//----------------------------------------------------------------------------------------------------------------------------------------------
		// ATRIBUTOS
		//----------------------------------------------------------------------------------------------------------------------------------------------
		
		public Button btnSair;
		public TextView assistencia;
		Spinner sp1, sp2, sp3;
		ArrayAdapter<CharSequence> ar0, ar1, ar2;
		RadioButton cb;
		
		//----------------------------------------------------------------------------------------------------------------------------------------------
		// CICLO DE VIDA DA ATIVIDADE
		//----------------------------------------------------------------------------------------------------------------------------------------------
		
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_bicicleta);
			
		/*	btnSair = (Button)findViewById(R.id.exit);
			Typeface font = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
			btnSair.setTypeface(font);
			btnSair.setOnClickListener(clickExit());*/
			
			sp1 = (Spinner)findViewById(R.id.estadoLuces);
			ArrayAdapter<CharSequence> ar0 = ArrayAdapter.createFromResource(this, R.array.LUCES, android.R.layout.simple_list_item_1);
			ar0.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
			sp1.setAdapter(ar0);
			
			sp2= (Spinner)findViewById(R.id.controlLuces);
			ar1 = ArrayAdapter.createFromResource(this, R.array.LUCES, android.R.layout.simple_list_item_1);
			ar1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
			sp2.setAdapter(ar1);
			this.spinner2(sp2, sp1);
			
			
			assistencia = (TextView)findViewById(R.id.infoasistenciaMotor);
		}

		
		//----------------------------------------------------------------------------------------------------------------------------------------------
		// REGRAS DE NEGÓCIO APLICAÇÃO
		//----------------------------------------------------------------------------------------------------------------------------------------------
		
		public void spinner2(Spinner spp, Spinner sps){
			String verifica = "ON";
			if(spp.getAdapter() != null){
				if(spp.equals(verifica)){
					sps.setAdapter(null);
				}
			}
		}
		 
		 
		 public void clickDisconect(View v){
			 assistencia.setText(" OFF ");
		 }

		 public void clickConect(View v){
			 assistencia.setText(" ON ");
		 }
		 
		 
			public void clickBici(View v){
				Intent i1 = new Intent(this, PatallaInicial.class);
				startActivity(i1);
			}
			
			public void clickGrabar(View v){
				Intent i1 = new Intent(this, GrabarRuta.class);
				startActivity(i1);
			}
			
			public void clickCarga(View v){
				Intent i1 = new Intent(this, CargarRuta.class);
				startActivity(i1);
			}
			
			public void clickAntiRobo(View v){
				Intent i3 = new Intent(this, AntiRobo.class);
				startActivity(i3);
			}

		 
		 
	/*		public void clickGrabar(View v){
				Intent i1 = new Intent(this, GrabarRuta.class);
				startActivity(i1);
			}
			
			public void clickCarga(View v){
				Intent i2 = new Intent(this, CargarRuta.class);
				startActivity(i2);
			}
			
			public void clickAntiRobo(View v){
				Intent i3 = new Intent(this, AntiRobo.class);
				startActivity(i3);
			}
			
			public void clickBici(View V){
				Intent i4 = new Intent(this, PatallaInicial.class);
				startActivity(i4);
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
