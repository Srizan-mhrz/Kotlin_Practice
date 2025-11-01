package com.example.ai37a

fun main(){
    val meaning = mapOf(
        "Brisk" to "Quick and active.",
    "Glimpse" to "A brief look.",
    "Humble" to "Not proud; modest.",
    "Grim" to "Harsh or unpleasant",
    "Swift" to "Moving very fast.",
    "Vast" to " Very large in size.",
    "Faint" to " Weak or unclear.",
    "Gloom" to "Partial darkness or sadness.",
    "Neat" to "Clean and orderly.",
    "Bold" to "Brave or confident."
    )
    print("enter any word for the meaning:")
    val input : String = readln() // this for taking input
    print(meaning[input]) // this prints the function meaning
}