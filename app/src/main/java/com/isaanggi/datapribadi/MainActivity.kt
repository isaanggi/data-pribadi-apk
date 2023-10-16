package com.isaanggi.datapribadi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.isaanggi.datapribadi.ui.theme.DataPribadiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DataPribadiTheme {
                DataPribadi()
            }
        }
    }
}

@Composable
fun DataPribadi(){
    Home()
}