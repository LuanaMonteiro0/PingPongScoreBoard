package br.edu.ifsp.scl.prdm.sc3029972.pingpongscoreboard

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel(val savedStateHandle: SavedStateHandle): ViewModel() {

    //Etapa 5: implementando estado de variaveis utilizando viewModel + SavedStateHandle
    private companion object{
        const val SCORE_BOARD_KEY="scoreboard"
    }

    private val _scoreBoardState = MutableStateFlow(savedStateHandle[SCORE_BOARD_KEY] ?: ScoreBoard())
    val scoreBoardState: StateFlow<ScoreBoard> = _scoreBoardState.asStateFlow()

//    var scoreTeamA by mutableIntStateOf(0)
//        private set
//
//    var scoreTeamB by mutableIntStateOf(0)
//        private set


    fun updateScoreTeamA(scoreTeamA: Int) {
        //this.scoreTeamA = scoreTeamA

        savedStateHandle[SCORE_BOARD_KEY] = _scoreBoardState.update{ it.copy(scoreTeamA = scoreTeamA) }
    }

    fun updateScoreTeamB(scoreTeamB: Int) {
        //this.scoreTeamB = scoreTeamB

        savedStateHandle[SCORE_BOARD_KEY] = _scoreBoardState.update{ it.copy(scoreTeamB = scoreTeamB) }
    }
}