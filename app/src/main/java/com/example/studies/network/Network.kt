package com.example.studies.network

sealed class Network {

    data class Progress(val status:Int): Network()
    data class Failure(val errorMessage:String, val status: Int): Network()
    data class Success(val data: String,val status: Int): Network()
}

class ResponseHandler(){

    fun parseResponse(status: Int,data: String?) = when(status) {
        200 -> {
            Network.Success(data?:"Success", status)
        }
        202 -> {
            Network.Progress(status)
        }
        401,404,500 -> {
            Network.Failure(data?: "error",status)
        }
        else -> Network.Failure(data?:"unknown error",status)
    }


}