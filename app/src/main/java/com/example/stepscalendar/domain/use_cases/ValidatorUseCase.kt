package com.example.stepscalendar.domain.use_cases

class ValidatorUseCase {
    fun validateStepsCount(steps: String): String {
        return if (steps.isNotBlank() && !steps.contains(" ") && steps.toLongOrNull() != null) ""
        else {
            "Некорректное количество шагов"
        }
    }
}