package aykuttasil.com.myandroidstructure.data.local.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by mertsimsek on 30/11/2017.
 */
@Entity(tableName = "radios")
data class RadioEntity(
        @PrimaryKey @ColumnInfo(name = "id") val id: String,
        @ColumnInfo(name = "radio_name") val radioName: String,
        @ColumnInfo(name = "website") val website: String,
        @ColumnInfo(name = "band") val band: String,
        @ColumnInfo(name = "city") val city: String,
        @ColumnInfo(name = "dial") val dial: String)