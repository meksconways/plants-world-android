package com.meksconways.plantsworld.di

import com.meksconways.plantsworld.core.datasource.RemoteDataSource
import com.meksconways.plantsworld.core.datasource.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindRemoteDataSource(ds: RemoteDataSourceImpl): RemoteDataSource

}