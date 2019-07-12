package com.example.ruchir.deeplinkingexample

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.Files.size


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val action: String? = intent?.action
        val data: Uri? = intent?.data
        var prefix = ""
        if (intent != null && intent.data != null
                && intent.getData().getScheme().equals("http")) {
            val data = intent.getData()
            val pathSegments = data.getPathSegments()
            if (pathSegments.size > 1)
                pageNumber.text = pathSegments.get(1) // This will give you prefix as path
        }
    }
}
