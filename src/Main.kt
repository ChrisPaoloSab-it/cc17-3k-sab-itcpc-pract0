fun main() {
    val lbs = 125
    val toKgs = lbs * 0.4535
    println("Weight in pounds (lbs): $lbs")
    println("Weight in kilograms (kgs): $toKgs")
    separator()
    val mi = 10
    val km = mi * 1.6093
    println("\nLength in Miles (mi): $mi")
    println("Length in Kilometers: $km")
    separator()
    val fahrenheit = -40
    val celsius = ((fahrenheit - 32) * 5) / 9
    println("\nTemperature in Fahrenheit (F): $fahrenheit")
    println("Temperature in Celsius (C): $celsius")
    separator()
    val studentAge = listOf(26, 21, 24, 21, 23, 29, 23, 29, 28, 21)
    val sumOfAge = studentAge.sum()
    val averageAge = sumOfAge.toDouble() / studentAge.size
    for ((index, list) in studentAge.withIndex()) {
        print("\nAge of Student ${index + 1} is $list")
    }
    println("\nThe average age of the students is: $averageAge")
    separator()
    val name1 = "Courier"
    val name2 = "Mr. House"
    val name3 = "Caesar"
    val name4 = "Yes Man"
    val item1 = "Platinum Chip"
    println("\nThe $name1, after completing all quests in the Mojave, decides whom to give the $item1.\nHe knows that it is an important item, created by $name2 and has been looking for it for the past 200 years.\n$name3, head of the Legion, wants the chip destroyed as it poses a danger to his plans.\nThese two men seem to have plans of their own to control New Vegas, but a third faction seems to benefit the Mojave the most.\n$name4, a Securiton reprogrammed by Benny and a member of the Followers, promises to provide the $name1 with all the support he needs to change the Mojave.\nRegardless of which faction gains control of the Mojave, the $name1 is the one who gets to decide.")
}

fun separator() {
    repeat(10) {
        print("====")
    }
}