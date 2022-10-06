#1 Function with a return type

Syntax- 
fun main () : return-type{
      body
      return statement
}

// By default, the return type is Unit
// Unit means the function doesn't return a value. (just like void in C++)

fun birthdayGreeting(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}
// works, need not have a return statement

fun birthdayGreeting(): String {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}
// gives error because of no return type (Only unit return type works without return statement)
fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

#2 Function with parameters

Syntax- 
fun main (parameters) : return-type{
      body
      return statement
}
