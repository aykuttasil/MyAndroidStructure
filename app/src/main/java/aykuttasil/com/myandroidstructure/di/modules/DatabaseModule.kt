package aykuttasil.com.myandroidstructure.di.modules

import android.arch.persistence.room.Room
import android.content.Context
import aykuttasil.com.myandroidstructure.data.AppDatabase
import aykuttasil.com.myandroidstructure.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by aykutasil on 20.12.2017.
 */
@Module
class DatabaseModule {

    companion object {
        val DB_NAME = "aa.db"
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME).build()

    @Provides
    @Singleton
    fun provideGenreDao(db: AppDatabase) = db.getGenreDao()

}