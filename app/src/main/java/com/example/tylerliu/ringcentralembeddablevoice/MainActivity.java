package com.example.tylerliu.ringcentralembeddablevoice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView.setWebContentsDebuggingEnabled(true);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://ringcentral.github.io/ringcentral-embeddable-voice/app.html");
    }
}
