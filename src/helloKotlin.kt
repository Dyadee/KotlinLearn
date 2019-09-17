import com.sun.xml.internal.fastinfoset.util.StringArray

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

    //Learn Arrays Here

    val myNumbers: IntArray = intArrayOf(2,3,43,21,54,5)
    var myFloat: FloatArray = floatArrayOf(2.34F, 3.23F, 5.32F, 8.32F)
    var myString: ArrayList<String> = arrayListOf<String>("derga", "nander", "faer")

    for(i in myNumbers) print( "$i, ")
    println()
    for(j in myFloat) print("$j, ")
    println()
    for (k in myString) print("$k, ")
}