fun main(){

    var colors= arrayOf("Blue" , "Red", "White" ,"Green")
    println(colors.contentToString())
city(arrayOf("harare","mumbai" , "dodoma" ,"jakarta"))

groupOfNumbers()
    getNames(arrayOf("Bella","Mike" ,"Dan"))
}
fun city(name: Array<String>){
    name.forEach { b ->
        println(b.capitalize())
    }


    }

fun groupOfNumbers(){
var numbers=(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    var sum=(numbers[1]+numbers[4])
    println(sum)

    var index=(numbers.indexOf(158))
    println(index)


var ascending=numbers.sortedArray()
    println(ascending.contentToString())

}

fun getNames(num: Array<String>):Array<String>{
    var b=num
    println(num.contentToString())
    return b

}