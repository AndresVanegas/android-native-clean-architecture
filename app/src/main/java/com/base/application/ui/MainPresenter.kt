package com.base.application.ui

import com.base.application.framework.data.DeviceLocationDataSourceImpl
import com.base.application.framework.data.InMemoryLocationDataSourceImpl
import com.base.data.LocationRepository
import com.base.domain.Location

class MainPresenter {

    private val locationRepository =
        LocationRepository(DeviceLocationDataSourceImpl(),InMemoryLocationDataSourceImpl())

    private fun requestNewLocation(): List<Location> = locationRepository.requestNewLocation()
}