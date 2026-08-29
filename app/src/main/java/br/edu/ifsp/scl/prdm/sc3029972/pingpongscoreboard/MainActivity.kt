package br.edu.ifsp.scl.prdm.sc3029972.pingpongscoreboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.ifsp.scl.prdm.sc3029972.pingpongscoreboard.ui.theme.PingPongScoreBoardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PingPongScoreBoardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()){

        Row(
            modifier = Modifier.fillMaxWidth()
                .weight(4f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){

        Column(
            modifier = Modifier.fillMaxHeight()
                .weight(1f),
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Jogador A",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Left,
                fontSize = 30.sp
            )

            Text(
                text = "0",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 130.sp
            )

            Button(
                modifier = Modifier.fillMaxWidth()
                    .padding(15.dp),
                colors = ButtonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White,
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color.DarkGray
                ),
                onClick = {}
            ){

                Text(
                    text = "+1",
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 50.sp
                )

            }

        }
        Column(
            modifier = Modifier.fillMaxHeight()
                .weight(1f),
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Jogador B",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Left,
                fontSize = 30.sp
            )

            Text(
                text = "0",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 130.sp
            )

            Button(
                modifier = Modifier.fillMaxWidth()
                    .padding(15.dp),
                colors = ButtonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White,
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color.DarkGray
                ),
                onClick = {}
            ){

                Text(
                    text = "+1",
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 50.sp
                )

            }
        }

        }

        Button(
            modifier = Modifier.fillMaxWidth()
                .weight(1f)
                .padding(15.dp),
            colors = ButtonColors(
                containerColor = Color.Black,
                contentColor = Color.White,
                disabledContentColor = Color.White,
                disabledContainerColor = Color.DarkGray
            ),
            onClick = {}
        ){

            Text(
                text = "Reiniciar",
                modifier = Modifier
                        .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 50.sp
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    PingPongScoreBoardTheme {
        MainScreen()
    }
}