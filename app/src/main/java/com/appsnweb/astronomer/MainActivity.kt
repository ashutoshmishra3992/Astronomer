package com.appsnweb.astronomer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.appsnweb.astronomer.core.theme.AstronomerTheme
import com.appsnweb.astronomer.presentation.ui.AstronomerApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AstronomerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AstronomerApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}