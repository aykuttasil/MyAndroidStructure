package aykuttasil.com.myandroidstructure.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import aykuttasil.com.myandroidstructure.data.local.dao.GenreDao
import aykuttasil.com.myandroidstructure.data.local.entity.GenreEntity

/**
 * Created by mertsimsek on 20/11/2017.
 */
@Database(
        entities = arrayOf(GenreEntity::class),
        version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getGenreDao(): GenreDao
}