package com.example.tarefasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarefasapp.ui.theme.TarefasAPPTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarefasAPPTheme {

            }
        }
    }
}
@Composable
fun corpo(modifier: Modifier = Modifier, conteudo: @Composable () -> Unit?) {
    Box(modifier = modifier) {
        conteudo()
    }
}

@Composable
@Preview(showBackground = true)
fun corpoPreview() {
    TarefasAPPTheme {
        corpo(
            modifier = Modifier.fillMaxSize(),
            {}
        )
    }
}