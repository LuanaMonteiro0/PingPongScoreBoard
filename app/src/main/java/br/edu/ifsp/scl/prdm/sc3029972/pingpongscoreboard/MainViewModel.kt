package br.edu.ifsp.scl.prdm.sc3029972.pingpongscoreboard

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var scoreTeamA by mutableIntStateOf(0)
        private set

    var scoreTeamB by mutableIntStateOf(0)
        private set


    fun updateScoreTeamA(scoreTeamA: Int) {
        this.scoreTeamA = scoreTeamA
    }

    fun updateScoreTeamB(scoreTeamB: Int) {
        this.scoreTeamB = scoreTeamB
    }
}