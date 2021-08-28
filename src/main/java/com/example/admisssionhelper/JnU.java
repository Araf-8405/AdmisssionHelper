package com.example.admisssionhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class JnU extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jn_u);
        webview = findViewById(R.id.webview);
        webview.setWebViewClient(new JnU.MyWebViewClient());
        String url = "http://admissionjnu.info/";
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);
    }

    public class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
    }

