fun main(args: Array<String>){



    val name: String = "Jade"
    var age: Int = 37
    val gender: String = "male"

    var a: Int = 32
    var b: Int = 3

    println("Hello, $name!")
    println("Welcome to Kotlin Programming.")

    println("Your name is $name and you are a $gender of $age years old.")

    fun max (a: Int, b: Int): Int{
        return if (a>b) a else b
    }

    fun min(a: Int, b: Int): Int = if(a < b) a else b

    println("The greater between $a and $b is ${max(a, b)}")
    println("The least between $a and $b is ${min(a, b)}")
}