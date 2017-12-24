package aykuttasil.com.myandroidstructure.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import aykuttasil.com.myandroidstructure.data.local.dao.GenreDao
import aykuttasil.com.myandroidstructure.data.local.dao.UserDao
import aykuttasil.com.myandroidstructure.data.local.entity.GenreEntity
import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy

@Database(
        entities = arrayOf(GenreEntity::class, UserEntitiy::class),
        version = 5)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getGenreDao(): GenreDao

    abstract fun getUserDao(): UserDao

}