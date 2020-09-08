package com.base.application.framework.data

import com.base.data.PercistenceLocationDataSource
import com.base.domain.Location


class InMemoryLocationDataSourceImpl : PercistenceLocationDataSource {

    private var savedLocations = emptyList<Location>()

    override fun getPersistedLocations(): List<Location> = savedLocations

    override fun saveNewLocation(location: Location){
        savedLocations = savedLocations + location
    }
}