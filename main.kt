fun main(){
    println("Which type of customer are you: 1. Residential 2. Business")
    var type = readLine()!!.toInt()

    if (type ==1){
        println("Enter name")
        var name = readLine()!!.toString()
        println("Enter phone number")
        var number = readLine()!!.toInt()
        PrintInfo(name, number)
    }
    else if (type == 2){
        println("Enter Business Name")
        var BusName = readLine()!!.toString()
        println("Enter contact name")
        var ConName = readLine()!!.toString()
        println("Enter contact number")
        var ConNumber = readLine()!!.toInt()
        PrintInfo(BusName, ConName, ConNumber)
    }

}

fun PrintInfo(name: String, number: Int){
    println("Name: $name")
    println("Phone number: $number")
}

fun PrintInfo(BusName: String, ConName: String, ConNumber: Int){
    println("Business name: $BusName")
    println("Contact name: $ConName")
    println("Contact phone number: $ConNumber")
}