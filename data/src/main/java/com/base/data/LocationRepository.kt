package com.base.data

import com.base.domain.Location

class LocationRepository(
    private val deviceLocationDataSource: DeviceLocationDataSource,
    private val percistenceLocationDataSource: PercistenceLocationDataSource
) {

    fun requestNewLocation(): List<Location>{
        val newLocation = deviceLocationDataSource.getDeviceLocation()
        percistenceLocationDataSource.saveNewLocation(newLocation)
        return percistenceLocationDataSource.getPersistedLocations()
    }

    fun getSavedLocations(): List<Location> = percistenceLocationDataSource.getPersistedLocations()

}

interface DeviceLocationDataSource {
    fun getDeviceLocation(): Location
}

interface PercistenceLocationDataSource {
    fun getPersistedLocations(): List<Location>
    fun saveNewLocation(location: Location)
}