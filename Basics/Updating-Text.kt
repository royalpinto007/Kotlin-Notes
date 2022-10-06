The onCreate() function is the entry point to this app and calls other functions to build the user interface. 
In Kotlin programs, the main() function is the specific place in your code where the Kotlin compiler starts. 
In Android apps, the onCreate() function fills that role.

The setContent() function within the onCreate() function is used to define your layout through composable functions. 
All functions marked with the @Composable annotation can be called from the setContent() function or from other Composable functions. 
The annotation tells the Kotlin compiler that this function is used by Jetpack Compose to generate the UI.
