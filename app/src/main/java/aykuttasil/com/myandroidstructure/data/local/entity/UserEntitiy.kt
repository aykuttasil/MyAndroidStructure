package aykuttasil.com.myandroidstructure.data.local.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by aykutasil on 24.12.2017.
 */
@Entity(tableName = "user")
data class UserEntitiy(
        @PrimaryKey @ColumnInfo(name = "user_id") val UserId: Long,
        @ColumnInfo(name = "user_name") val UserName: String,
        @ColumnInfo(name = "user_age") val UserAge: Int,
        @ColumnInfo(name = "user_city") val UserCity: String,
        @ColumnInfo(name = "user_email") val UserEmail: String
)