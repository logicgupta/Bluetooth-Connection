package com.example.bluetoothcustomapp.di

import android.content.Context
import com.example.bluetoothcustomapp.data.chat.AndroidBluetoothController
import com.example.bluetoothcustomapp.domain.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesBluetoothController(@ApplicationContext context: Context):BluetoothController{
        return AndroidBluetoothController(context)
    }
}