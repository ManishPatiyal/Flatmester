package com.msolutions.flatmester.database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
class Product {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var title: String? = null

    var description: String? = null
}