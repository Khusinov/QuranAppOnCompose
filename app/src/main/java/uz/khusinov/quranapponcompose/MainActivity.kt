package uz.khusinov.quranapponcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.khusinov.quranapponcompose.ui.theme.QuranAppOnComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuranAppOnComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    FirstTextView("Quran app")
                }
            }
        }
    }
}

@Composable
fun FirstTextView(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Quran App",
        color = Color.DarkGray,
        modifier = Modifier.padding(80.dp).size(30.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuranAppOnComposeTheme {
        FirstTextView("Quran app 2")
    }
}