package com.example.studies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.studies.network.Network
import com.example.studies.network.ResponseHandler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val responseHandler = ResponseHandler()
        val response = responseHandler.parseResponse(200,"example data")
        response.handleResponse()
    }

    private fun Network.handleResponse(){
        when(this){
            is Network.Success ->{Log.d("czwiczenie",data)}
            is Network.Progress ->{Log.d("czwiczenie","progress")}
            is Network.Failure ->{Log.d("czwiczenie",errorMessage)}
        }
    }
}