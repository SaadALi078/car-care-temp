package com.example.carcare
import android.app.Application
import android.util.Log
import com.google.firebase.FirebaseApp

class CarCareApp:Application() {

    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(this)
        Log.d("App", "Firebase initialized") // Add this for debug
    }


}