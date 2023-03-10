fun main()
{
    /*************************************************************************************
     *                               KOTLIN TUTORIAL                                     *
     *************************************************************************************/

    /********************************* VARIABLES *****************************************/
    /*var userName1: String = "Alex"  //String is redundant
    userName1 = "John"
    println("Hello, $userName1!")

    val userName2: String = "John"
    //userName2 = "Alex"
    //val cannot be reassigned


    var age: Int = 22

    println("Hello, $userName1 your age is $age!")*/
    /*************************************************************************************/

    /******************************** INTEGER TYPE ***************************************/
    /*var number: Int = 22

    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue = Int.MIN_VALUE

    println("Int maximum value is: $maxIntegerValue\nInt minimum value is: $minIntegerValue")*/
    /*************************************************************************************/

    /*********************** FLOAT, DOUBLE, CHAR AND BOOLEAN *****************************/
    /*val myNumber = 2.5f             //float
    val mySecondNumber = 2.5        //double

    println("myNumber = $myNumber and mySecondNumber = $mySecondNumber")

    val myCharValue: Char = 'D'
    val myBooleanValue: Boolean = false

    println("myCharValue = $myCharValue or you can use " + myCharValue)
    println("myBooleanValue = $myBooleanValue")*/
    /*************************************************************************************/

    /********************************** OPERATORS ****************************************/
    /*var x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}\n")

    println("x = ${x++}")
    println("x = ${++x}")*/
    /*************************************************************************************/

    /*********************************** IF ELSE *****************************************/
    /*val myNumber = 100

    if (myNumber < 150) {
        println("Less than 150")
    }
    else if (myNumber >= 190) {
        println("Greater or equal to 190")
    }
    else {
        println("All the conditions failed")
    }

    val isActive = true

    if (!isActive) {
        println("The user is not active")
    }
    else {
        println("The use is active")
    }

    val isPlaying = true
    val score = 100

    if (isPlaying && score == 100)
        println("Next level opened")
    else
        println("Still at the same level")

    val num1 = -5
    val num2 = -3

    val text = if (num1 > 0 || num2 > 0) {
        println("The condition is true")
        "This is text 1"                    //The last expression in {} is assigned as a value to the variable
    }
    else {
        println("This condition is false")
        5                                   //It infers the type of variable, unless we specify the type (val text: String)
    }
    println("$text")*/
    /*************************************************************************************/

    /************************************* WHEN ******************************************/
    /*val alarm = 13

    val text1 = when (alarm) {
        12, 19, 14 -> {
            println("The time is $alarm")
            "Some text"
        }
        15 -> {
            println("The time is $alarm")
            "Some text"
        }
        in 1..10 -> {
            println("The number is in the range 1-10")
            "Even more text"
        }
        else -> "So much text"
    }

    println(text1)

    val text2 = when {
        alarm >= 10 -> "The number is larger than 10"
        alarm == 8 || alarm == 7 -> "The time is $alarm"
        else -> "The time is $alarm"
    }

    println(text2)*/
    /*************************************************************************************/

    /************************************* NULL ******************************************/
    /*val text1: String? = null
    println(text1)
    //println(text1.length)        //Only safe and non-null asserted are allowed

    val text2: String? = "Hello"
    if (text2 != null) {
        println(text2.length)
    }
    else   {
        println("The variable is null")
    }
    //OR
    val text3: String? = null
    println(text3?.length)
    //println(text3!!.length)             //Throws exception if null

    val text4 = text1 ?: "Some text"    //If text1 is null assign the right value
    println(text4)*/
    /*************************************************************************************/

    /*********************************** FUNCTIONS ***************************************/
    sayHello("Alex", 22)

    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some data")
    }
    else {
        showMesaage()
    }
}

fun sayHello(name: String, age: Int) {
    println("Hello, $name! Your age is $age.")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMesaage() {
    println("There is no internet connection")
}