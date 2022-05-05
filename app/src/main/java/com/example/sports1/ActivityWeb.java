package com.example.sports1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {
    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv1=(WebView) findViewById(R.id.webview);
        //Recuperar valores por el intent
        String URL=getIntent().getStringExtra("SitioWeb");
        //Permitira al user navegar solo en la app
        wv1.setWebViewClient(new WebViewClient());
        //abrira el sitio que solicita
        wv1.loadUrl("http://"+URL);
    }

    public void Cerrar(View view) {
        finish();//Cerrar solo el activity actual
    }
}