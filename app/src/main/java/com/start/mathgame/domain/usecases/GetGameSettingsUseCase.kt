package com.start.mathgame.domain.usecases

import com.start.mathgame.domain.entity.GameSettings
import com.start.mathgame.domain.entity.Level
import com.start.mathgame.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}