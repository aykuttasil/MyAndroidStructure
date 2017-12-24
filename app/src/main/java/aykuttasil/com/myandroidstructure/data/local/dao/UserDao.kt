package aykuttasil.com.myandroidstructure.data.local.dao

import android.arch.persistence.room.*
import aykuttasil.com.myandroidstructure.data.local.entity.UserEntitiy
import io.reactivex.Flowable

/**
 * Created by aykutasil on 24.12.2017.
 */
@Dao
abstract class UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertItems(list: List<UserEntitiy>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertItem(item: UserEntitiy): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    abstract fun updatetItem(item: UserEntitiy)

    @Delete
    abstract fun deletetItem(item: UserEntitiy)

    @Query("SELECT * FROM user")
    abstract fun getItems(): Flowable<List<UserEntitiy>>

    @Query("SELECT * FROM user WHERE user_id=:id")
    abstract fun getItem(id: Long): UserEntitiy

    @Insert
    abstract fun insertAll(vararg users: UserEntitiy)

}