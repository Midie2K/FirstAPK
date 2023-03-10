package com.example.studies

class FirstClass {
    //stałe
    val name : String = "Patryk"
    val surname : String = "Pańczuk"
    val age : Int = 23
    //zmienne
    lateinit var login : String
    lateinit var password : String
    var id : Int = 1
}

class Wrapper(var first : FirstClass){

    fun setUserLogin():String{
    return "Midie"
    }

    fun setPassword():String{
        return "123"
    }
    fun setID():Int{
        return 1
    }


}