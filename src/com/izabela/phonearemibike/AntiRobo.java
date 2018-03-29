package com.izabela.phonearemibike;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class AntiRobo extends android.support.v4.app.FragmentActivity {

	public Button btnSair;
    WebView wvGrafico;
    String strURL;
    
    
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_anti_robo);
	/*
		btnSair = (Button)findViewById(R.id.exit);
		Typeface font = Typeface.createFromAsset(getAssets(), "UbuntuMono-B.ttf"); 
		btnSair.setTypeface(font);
		btnSair.setOnClickListener(clickExit());*/
		
		strURL = "https://chart.googleapis.com/chart?" + 
	            "cht=lc&" + //define o tipo do gráfico "linha"
	            "chxt=x,y&" + //imprime os valores dos eixos X, Y
	            "chs=280x250&" + //define o tamanho da imagem
	            "chd=t:10,45,5,10,13,26,13&" + //valor de cada coluna do gráfico
	            "chl= L|M|X|J|V|S|D" + //rótulo para cada coluna
	            //"chdl= --" + //legenda do gráfico
	            "chxr=1,0,50&" + //define o valor de início e fim do eixo 
	            "chds=0,50&" + //define o valor de escala dos dados 
	            "chg=0,5,0,0&" + //desenha linha horizontal na grade
	            "chco=3D7930&" + //cor da linha do gráfico 
	            "chtt=Acelerómetro Alarma+x+1000&" + //cabeçalho do gráfico
	            "chm=B,C5D4B5BB,0,0,0"; //fundo verde 
	 
	         
	        //Abaixo seguem outros exemplo de gráfico:
	        //strURL = "https://chart.googleapis.com/chart?cht=lc&chxt=x,y&chs=300x300&chd=t:10,45,5,10,13,26&chl=Janeiro|Fevereiro|Marco|Abril|Maio|Junho&chdl=Vendas%20&chxr=1,0,50&chds=0,25&chg=0,5,0,0&chco=3D7930&chtt=Vendas+x+1000&chm=v,FF0000,0,::.10,4";
	        //strURL = "http://chart.apis.google.com/chart?cht=bhg&chs=550x400&chd=t:100,50,115,80|10,20,15,30&chxt=x,y&chxl=1:|Janeiro|Fevereiro|Marco|Abril&chxr=0,0,120&chds=0,120&chco=4D89F9&chbh=35,0,15&chg=8.33,0,5,0&chco=0A8C8A,EBB671&chdl=Vendas|Compras";
	        //strURL = "https://chart.googleapis.com/chart?cht=lc&chxt=x,y&chs=700x350&chd=t:10,45,5,10|30,35,30,15|10,10.5,30,35&chl=Janeiro|Fevereiro|Marco|Abril&chdl=Vendas|Compras|Outros&chxr=1,0,50&chds=0,50&chg=0,5,0,0&chco=DA3B15,3072F3,000000&chtt=grafico+de+vendas";
	        //strURL = "https://chart.googleapis.com/chart?cht=p3&chs=200x90&chd=t:40,45,5,10&chl=Jan|Fev|Mar|Abr";
	        //strURL = "http://chart.apis.google.com/chart?chxl=0:|Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec&chxt=x,y&chs=300x300&cht=r&chco=FF0000&chd=t:63,64,67,73,77,81,85,86,85,81,74,67,63&chls=2,4,0&chm=B,FF000080,0,0,0";
	 
	        wvGrafico = (WebView)findViewById(R.id.wvGrafico);
	        wvGrafico.loadUrl(strURL);
	         
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
		Intent i2 = new Intent(this, CargarRuta.class);
		startActivity(i2);
	}
	

	
	
	

/*	
	public void clickBici(View v){
		Intent i = new Intent(this, Bicicleta.class);
		startActivity(i);
	}
	
	public void clickGrabar(View v){
		Intent i1 = new Intent(this, GrabarRuta.class);
		startActivity(i1);
	}
	
	public void clickCarga(View v){
		Intent i2 = new Intent(this, CargarRuta.class);
		startActivity(i2);
	}
	
	public void clickBack(View v){
		Intent i3 = new Intent(this, PatallaInicial.class);
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




