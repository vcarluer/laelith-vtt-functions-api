package org.laelith.vttapi.domain

data class DiceRollResults(
    val expression: String,
    val result: Int,
    val rolls: List<DiceRollResult>)
