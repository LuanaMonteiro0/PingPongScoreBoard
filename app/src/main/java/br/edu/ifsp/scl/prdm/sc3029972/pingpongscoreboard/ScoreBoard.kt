package br.edu.ifsp.scl.prdm.sc3029972.pingpongscoreboard

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//Etapa 4: implementando estado de variaveis utilizando viewModel + stateFlow

//Etapa 5: implementando estado de variaveis utilizando viewModel + SavedStateHandle
@Parcelize
data class ScoreBoard(
    var scoreTeamA : Int = 0,
    var scoreTeamB : Int = 0
): Parcelable
