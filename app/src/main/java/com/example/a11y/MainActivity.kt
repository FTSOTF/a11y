package com.example.a11y

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("file:///android_res/drawable/article_52573")


    }

    fun goNext(view: View) {
        webView.loadUrl("https://support.google.com/accessibility/android/answer/9728765")
    }

    fun goPrev(view: View) {
        webView.goBack()
    }
}