package com.example.stepscalendar.domain.repositories

import androidx.health.connect.client.HealthConnectClient
import java.time.ZonedDateTime

interface HealthConnectRepository {

    suspend fun getStepsCount(
        healthConnectClient: HealthConnectClient,
        startTime: ZonedDateTime,
        endTime: ZonedDateTime
    ): Long

    suspend fun writeStepsRecord(
        healthConnectClient: HealthConnectClient,
        startTime: ZonedDateTime,
        endTime: ZonedDateTime,
        count: Long
    )

    suspend fun removeStepsRecord(
        healthConnectClient: HealthConnectClient,
        startTime: ZonedDateTime,
        endTime: ZonedDateTime,
    )
}