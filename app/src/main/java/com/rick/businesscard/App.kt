package com.rick.businesscard

import android.app.Application
import com.rick.businesscard.data.AppDatabase
import com.rick.businesscard.data.BusinessCardRepository

class App : Application() {

    val database by lazy { AppDatabase.getDatabase(this) }

    val repository by lazy { BusinessCardRepository(database.businessDao()) }

}