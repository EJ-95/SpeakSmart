package com.serc.joh40010740.speaksmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by emmajohnston on 15/05/2017.
 */

public class WebActivity extends AppCompatActivity {

    private WebView myWebView;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        myWebView = (WebView)findViewById(R.id.WebView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://en.oxforddictionaries.com/explore/foreign-words-and-phrases");
        myWebView.setWebViewClient(new WebViewClient());
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_menu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(final MenuItem item) {

        //respond to menu item selection
        switch (item.getItemId()) {
            case R.id.id_about:
                startActivity((new Intent(this, AboutActivity1.class)));
                return true;
            case R.id.id_translator:
                startActivity((new Intent(this, TranslatorActivity.class)));
                return true;
            case R.id.id_countries:
                startActivity((new Intent(this, WebActivity.class)));
                return true;
            case R.id.id_logout:
                startActivity((new Intent(this, MainActivity.class)));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
