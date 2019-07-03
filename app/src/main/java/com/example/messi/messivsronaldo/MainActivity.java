package com.example.messi.messivsronaldo;

import android.support.v7.app.AppCompatActivity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("http://messivsronaldo.net/");
        mywebView.setWebViewClient(new WebViewClient());
    }
    public class myWebClient extends WebViewClient{
        @Override
        public void onPageStarted (WebView view, String Url, Bitmap favicon){
            super.onPageStarted( view, Url, favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return (true);
        }
    }
    @Override
    public void onBackPressed (){
        if (mywebView.canGoBack()) {
            mywebView.goBack();
        }
            else{
                super.onBackPressed();
               }
        }
    }

