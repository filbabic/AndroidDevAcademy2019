package hr.ferit.brunozoric.taskie

import android.app.Application

class Taskie: Application() {

    companion object {
        lateinit var instance: Taskie
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}