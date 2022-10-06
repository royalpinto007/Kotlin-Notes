Composable functions are like regular functions with a few differences:
1) @Composable function names are capitalized.
2) You add the @Composable annotation before the function.
3) @Composable functions can't return anything.

@Composable
fun Greeting(name: String) {
   Text(text = "Hello $name!")
}

A Modifier is used to augment or decorate your composable.
