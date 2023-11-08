package com.dam.simonmemolesta

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dam.simonmemolesta.ui.theme.SimonMeMolestaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimonMeMolestaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    simon()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun simons () {
    var estaComenzada: Boolean = false
    var ronda: Int = 0
    Row {
        Column {
            Text(text = "", Modifier.height(45.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(100.dp)
                    .width(175.dp)
                    .padding(40.dp, 0.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(100.dp)
                    .width(175.dp)
                    .padding(30.dp, 0.dp),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ) {}
            Button(
                onClick = { estaComenzada = true },
                modifier = Modifier
                    .height(30.dp)
                    .width((300 / 2).dp)
                    .padding(horizontal = 30.dp, vertical = 0.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
            ) {
                if (estaComenzada == false) {
                    Text(text = "Start")
                    estaComenzada = true
                } else {
                    Text(text = "Restart")
                }

            }
        }
        Column {
            Column {
                Text(text = "Ronda")
                Text("${ronda}")
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(100.dp)
                    .width(175.dp)
                    .padding(30.dp, 0.dp),
                colors = ButtonDefaults.buttonColors(Color.Green)
            ) {
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(100.dp)
                    .width(175.dp)
                    .padding(30.dp, 0.dp),
                colors = ButtonDefaults.buttonColors(Color.Yellow)
            ) {
            }
            Button(
                onClick = {
                    Log.d("Apretado", "${ronda++}")
                },
                modifier = Modifier
                    .height(30.dp)
                    .width((300 / 2).dp)
                    .padding(horizontal = 30.dp, vertical = 0.dp),
                colors = ButtonDefaults.buttonColors(Color.Gray)
            ) {
                Image(
                    painter = painterResource(R.drawable.very),
                    contentDescription = "Icono2"
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimonMeMolestaTheme {
        Greeting("Android")
    }
}