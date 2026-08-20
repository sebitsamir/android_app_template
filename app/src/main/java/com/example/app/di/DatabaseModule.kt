package com.example.app.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Wire Room database + DAOs here when your app needs local storage.
 *
 * Example:
 * ```
 * @Provides @Singleton
 * fun provideDatabase(@ApplicationContext context: Context): AppDatabase =
 *     Room.databaseBuilder(context, AppDatabase::class.java, "app.db").build()
 *
 * @Provides fun provideExampleDao(db: AppDatabase): ExampleDao = db.exampleDao()
 * ```
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule
