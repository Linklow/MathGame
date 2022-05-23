package com.start.mathgame.domain.repository

import com.start.mathgame.domain.entity.GameSettings
import com.start.mathgame.domain.entity.Level
import com.start.mathgame.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}