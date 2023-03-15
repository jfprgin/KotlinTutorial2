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

    /*********************************** FOR LOOP ****************************************/
    /*for (i in 1..10) {                  //includes the last value
        println("i = $i")
    }
    for (j in 1 until 10) {            //until excludes the last value
        println("j = $j")
    }

    for (k in 10 downTo 1) {           //downTo counts down
        println("k = $k")
    }

    for (l in 1..10 step 2) {          //step skips the values
        println("l = $l")
    }*/
    /*************************************************************************************/

    /***************************** WHILE AND DO WHILE LOOP *******************************/
    /*var number = 0

    while (number < 10) println(number++)
*//*    {
        println(number)
        number++
    }*//*

    number = 0
    do {
        println(number++)
    } while (number < 10)

    number = 0
    while (number < 10) {
        number++
        if (number == 7) {
            break
        }
        if (number in 3..5) {
            continue
        }
        println(number)
    }

    for (i in 0..10) {
        if (i in 3..8) {
            continue
        }
        println(i)
    }

    number = 0
    outer@ while (number < 5) {
        number++
        println(number)

        var i = 0

        while (i < 5) {
            if (i == 0) break@outer                         //breaks the outer loop
            i++
            println("***$i")
        }
    }*/

    /*val range = Scanner(System.`in`)
    var counter = 0

    for (number in 1..range.nextInt()) {
        if (number % 2 == 0) {
            println(number)
            counter++
        }
    }
    println(counter)*/
    //OR
    /*var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++

        if((number % 2) != 0) {
            continue
        }

        evenNumberCounter++
        println(number)
    }
    println("Total number of even numbers: $evenNumberCounter")*/
    /*************************************************************************************/

    /************************************* ARRAY *****************************************/
    val names = arrayOf("John", "Stephen", "Megan")                     //val names: Array<String> also works
    val values = arrayOf(4, 5, 6, 7, "Alex", 'a', 5.6, true)
    names[0] = "Alex"
    println("First element: ${names[0]}")
    println("The size of the array is: ${names.size}")

    for (name in names) {
        println(name)
    }

    for (i in values) {
        if (i is Int) {                                                             //is operator checks the type of the variable
            println(i)
        }
    }

    val minMaxArray = arrayOf(5, 2, 3, 6, 1, 4, 9, 8, 7)
    var isMax = true
    println(findMax(minMaxArray))
    println(findMin(minMaxArray))
    println(findMinOrMax(minMaxArray, isMax))

    /*************************************************************************************/

    /*********************************** FUNCTIONS ***************************************/
    /*sayHello("Alex", 22)

    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some data")
    }
    else {
        showMessage()
    }

    val max1 = getMax(5, 9)
    println("The maximum number is: $max1")

    val max2 = getMax(5.6, 9.7)

    val max3 = getMax(5, 7, 10)

    sendMessage("Alex", "Hello")
    sendMessage(message = "Hello", name = "Alex")     //Named arguments

    println(sum1(5, 6 , 7, 10, 3))

    sum2(5, 6, 7, 10, 3)*/
}

/*fun sayHello(name: String, age: Int) {
    println("Hello, $name! Your age is $age.")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There is no internet connection")
}

*//*fun getMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}*//*
//OR
fun getMax(a: Int, b: Int) = if (a > b) a else b
fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    }
    else if (b >= a && b >= c) {
        b
    }
    else {
        c
    }
}

fun sendMessage(name: String = "User", message: String = sendText()) {       //Default value
    println("Name = $name and message = $message")
}

fun sendText() = "Some text"

fun sum1(vararg numbers: Int): Int {     //Variable number of arguments
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}
fun sum2(vararg numbers: Int) {
    numbers.forEach { println(it) }
}*/

fun findMin(minArray: Array<Int>): Int {
    var min = minArray[0]
    for (i in minArray) {
        if(i < min) {
            min = i
        }
    }
    return min
}

fun findMax(maxArray: Array<Int>): Int {
    var max = maxArray[0]
    for (i in maxArray) {
        if(i > max) {
            max = i
        }
    }
    return max
}

fun findMinOrMax(minMaxArray: Array<Int>, minOrMax: Boolean): Int {
    if (minOrMax) {
        return findMax(minMaxArray)
    }
    else {
        return findMin(minMaxArray)
    }
}