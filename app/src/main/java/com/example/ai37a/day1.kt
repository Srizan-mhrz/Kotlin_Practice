package com.example.ai37a

fun main(){
    print("hello")
    println("world")

    //in java
    //String name = " Shrijan "

    //in kotlin
    var name: String = "Shrijan" //mutable value
    val age : Int = 20 //immutable value
    name = "Shri" //name can be changed but not the age
    val weight : Double = 0.0
    //in java we concat like this
    //println("My name is"+name+"and my age is "+age+"and mmy weight is "+weight);
    //but in kotlin we concat like
    println("my name is ${name.uppercase()} and my age is $age and weight is $weight")

    //Array
    val size = arrayOf(10,20,30)
    size[2]= 50
    println(size[2])


    //Arraylist

    val Size1 = arrayListOf<Int>(10, 20, 30)

    //for loop in kotlin is
    for(i in 0..10){
        print(i)
    }//it will print 0 to 10

    for (i in 0 until 10){
        print(i)
    }// this will print 0 to 9

    for (i in 0..10 step 2 ){
        print(i)
    }// this will print even numbers


}