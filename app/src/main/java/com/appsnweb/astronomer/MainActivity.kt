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
import com.appsnweb.astronomer.domain.Logger
import com.appsnweb.astronomer.domain.usecase.GetApodUseCase
import com.appsnweb.astronomer.presentation.ui.AstronomerApp
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var logger: Logger

    @Inject
    lateinit var getApodUseCase: GetApodUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger.log("MainActivity Created")

        MainScope().launch {
            val result = getApodUseCase()
            result.onSuccess { apod ->
                logger.log("NASA APOD: ${apod.title}")
            }.onFailure { error ->
                logger.log("NASA APOD Error: ${error.message}")
            }
        }

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