package br.edu.ifsp.scl.prdm.sc3029972.pingpongscoreboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
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

// etapa 3: implementando estado de variaveis utilizando ViewModel + mutableIntStateOf
@Composable
fun MainScreen(modifier: Modifier = Modifier, mainViewModel: MainViewModel = viewModel()) {

    // etapa 1: implementando estado de variaveis utilizando a função remember
    //var scoreTeamA by remember { mutableIntStateOf(0) }
    //var scoreTeamB by remember { mutableIntStateOf(0) }

    // etapa 2: implementando estado de variaveis utilizando a função rememberSaveable
    // var scoreTeamA by rememberSaveable { mutableIntStateOf(0) }
    // var scoreTeamB by rememberSaveable { mutableIntStateOf(0) }

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
                text = mainViewModel.scoreTeamA.toString(),
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
                onClick = {
                    var scoreA = mainViewModel.scoreTeamA
                    scoreA++
                    mainViewModel.updateScoreTeamA(scoreA)
                }
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
                text = mainViewModel.scoreTeamB.toString(),
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
                onClick = {
                    var scoreB = mainViewModel.scoreTeamB
                    scoreB++
                    mainViewModel.updateScoreTeamB(scoreB)
                }
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
            onClick = {
                mainViewModel.updateScoreTeamA(0)
                mainViewModel.updateScoreTeamB(0)
            }
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