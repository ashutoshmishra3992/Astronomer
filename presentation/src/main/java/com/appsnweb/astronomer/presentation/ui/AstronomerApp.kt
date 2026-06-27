package com.appsnweb.astronomer.presentation.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.appsnweb.astronomer.core.theme.AstronomerTheme

@Composable
fun AstronomerApp(modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to Astronomer!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun AstronomerAppPreview() {
    AstronomerTheme {
        AstronomerApp()
    }
}
