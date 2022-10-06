Syntax-
val name : datatype = value
or
val name = value

Example-
val count: Int = 2
val count = 2

#1 Use of $ to use values in a string-
    fun main() {
        val count: Int = 2
        println("You have $count unread messages.")
    }
Output- You have 2 unread messages.

#2 fun main() {
    val cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")
    }
val cannot be reassigned, gives compilation error. Hence, we make use of var.
fun main() {
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")
}

#3 fun main() {
    val nextMeeting = "Next meeting is: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)
    }
    
    fun main() {
    println("Say \"hello\"")
    }
    Output- Say "hello"

#4  Adding Comments-

 /**
 * This program displays the number of messages
 * in the user's inbox.
 */
fun main() {
    // Create a variable for the number of unread messages.
    var count = 10
    println("You have $count unread messages.")

    // Decrease the number of messages by 1.
    count--
    println("You have $count unread messages.")
}
