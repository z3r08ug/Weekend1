package dev.uublabs.weekend1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RosterActivity extends BaseDrawerActivity
{

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_roster, frameLayout);

        setTitle("Patriots Roster 2017-18");

        webView = findViewById(R.id.webV);
        WebSettings webSettings = webView.getSettings();
        WebViewClient webViewClient  = new WebViewClient();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(webViewClient);

        webView.loadUrl("http://www.patriots.com/team/roster");
    }

}
