package br.edu.ifsp.scl.prdm.sc3029972.pingpongscoreboard

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel: ViewModel() {

    private val _scoreBoardState = MutableStateFlow(ScoreBoard())
    val scoreBoardState: StateFlow<ScoreBoard> = _scoreBoardState.asStateFlow()

//    var scoreTeamA by mutableIntStateOf(0)
//        private set
//
//    var scoreTeamB by mutableIntStateOf(0)
//        private set


    fun updateScoreTeamA(scoreTeamA: Int) {
        //this.scoreTeamA = scoreTeamA

        _scoreBoardState.update{ it.copy(scoreTeamA = scoreTeamA) }
    }

    fun updateScoreTeamB(scoreTeamB: Int) {
        //this.scoreTeamB = scoreTeamB

        _scoreBoardState.update{ it.copy(scoreTeamB = scoreTeamB) }
    }
}