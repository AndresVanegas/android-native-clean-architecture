package com.base.application.framework.data

import com.base.data.DeviceLocationDataSource
import com.base.domain.Location
import java.util.*
import kotlin.random.Random


class DeviceLocationDataSourceImpl : DeviceLocationDataSource {

    private val random = Random(System.currentTimeMillis())

    override fun getDeviceLocation(): Location =
        Location(
            random.nextDouble() * 180 - 90,
            random.nextDouble() * 360 - 180,
            Date()
        )
}