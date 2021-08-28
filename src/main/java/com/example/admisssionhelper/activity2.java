package com.example.admisssionhelper;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

public class activity2 extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void web4(View view) {
        Intent intent = new Intent(activity2.this, UD.class);
        startActivity(intent);
    }

    public void web5(View view) {

        Intent intent = new Intent(activity2.this, Ju.class);
        startActivity(intent);
    }

    public void web6(View view) {
        Intent intent = new Intent(activity2.this, JnU.class);
        startActivity(intent);
    }


    }
