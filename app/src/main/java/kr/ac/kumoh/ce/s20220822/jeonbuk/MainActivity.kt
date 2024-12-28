package kr.ac.kumoh.ce.s20220822.jeonbuk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import kr.ac.kumoh.ce.s20220822.jeonbuk.ui.theme.JeonbukTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JeonbukTheme {
                val navController = rememberNavController()
                AppScaffold(navController = navController) // 드로어를 포함한 Scaffold UI
            }
        }
    }
}