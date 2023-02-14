package org.laelith.vttapi.service

import dev.diceroll.parser.ResultTree
import dev.diceroll.parser.detailedRoll
import org.laelith.vttapi.domain.DiceRollRequest
import org.laelith.vttapi.domain.DiceRollResult
import org.laelith.vttapi.domain.DiceRollResults
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DiceService {
    @Bean
    fun roll(): (DiceRollRequest) -> DiceRollResults = {
        val resultTree = detailedRoll(it.expression)
        DiceRollResults(
            expression = resultTree.expression.description(),
            result = resultTree.value,
            rolls = this.getFlattenResults(resultTree)
        )
    }

    private fun getFlattenResults(resultTree: ResultTree): List<DiceRollResult> {
        val results = mutableListOf<DiceRollResult>()
        resultTree.results.forEach {
            results.add(DiceRollResult(
                expression = it.expression.description(),
                result = it.value
            ))
            results.addAll(this.getFlattenResults(it))
        }

        return results
    }
}