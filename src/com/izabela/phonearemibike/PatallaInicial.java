package com.izabela.phonearemibike;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Timer;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PatallaInicial extends Activity {

	//----------------------------------------------------------------------------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------------------------------------------------------------------------
		public TextView jtTextField1 ;
	
	
		public Button btnBicicleta, btnGrabar,btnCargar,btnRoubo, btnSair;
		public TextView lblhora, lbltempo, lbldistancia, lblcaloria, lblmarcha, lblbateria;

	//	Spinner sp1;
		
	//----------------------------------------------------------------------------------------------------------------------------------------------
	// CICLO DE VIDA DA ATIVIDADE
	//----------------------------------------------------------------------------------------------------------------------------------------------

		
		
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_patalla_inicial);
			
			
			
	/*		btnSair = (Button)findViewById(R.id.exit);
			Typeface font = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
			btnSair.setTypeface(font);
			btnSair.setOnClickListener(clickExit());

			
			lbltempo= (TextView)findViewById(R.id.tiempoPercurso);
			Typeface font1 = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
			lbltempo.setTypeface(font1);
			
			lbldistancia= (TextView)findViewById(R.id.distanciaPercorrida);
			Typeface font2 = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
			lbldistancia.setTypeface(font2);
			
			lblcaloria= (TextView)findViewById(R.id.caloriasConsumidas);
			Typeface font3 = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
			lblcaloria.setTypeface(font3);
			
			lblmarcha= (TextView)findViewById(R.id.marcha);
			Typeface font4 = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
			lblmarcha.setTypeface(font4);
			
			lblbateria= (TextView)findViewById(R.id.porcentagemBateria);
			Typeface font5 = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
			lblbateria.setTypeface(font5);
			

			lblhora= (TextView)findViewById(R.id.hora0);
			Typeface font6 = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
			lblhora.setTypeface(font6); */
			
			 /*
			
			adapter = new LinguagemArrayAdapter(getApplicationContext(), R.layout.activity_patalla_inicial, linguagens);
	        
	        Buscando o elemento Listview da nossa interface principal interface 
	       // lstLinguagens = (TextView) findViewById(R.id.infoTiempoPercurso);
	        // Setando o adapter em nossa ListView
	     //   lstLinguagens.setText((CharSequence) adapter);
	        

	          public void onItemClick(AdapterView<?> parent, View view,
	                                  int position, long id) {
	            
	            try{
	              JSONObject linguagem = linguagens.get(position);
	              String descricao = linguagem.getString("descricao");
	              Toast.makeText(getApplicationContext(), descricao, 10000).show();
	            }catch (JSONException e) {
	            }
	          }
	          
	    //    }); */
	        

			
		}
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------
		// METODOS DE CLIQUE
		//----------------------------------------------------------------------------------------------------------------------------------------------

	/*	public void clickBici(){
			Intent i1 = new Intent(this, PatallaInicial.class);
			startActivity(i1);
		}*/
		
		public void clickGrabar(View v){
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
		
	/*	public View.OnClickListener clickExit() {
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
