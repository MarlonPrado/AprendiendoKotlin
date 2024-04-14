fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    val operatingSystem2 = "Windows OS"
    val emailId2 = "acatinteligent@gmail.com"

    val emailId3 = "bearbored@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
    println(displayAlertMessage(operatingSystem2, emailId2))
    println(displayAlertMessage(email=emailId3))

}

fun displayAlertMessage (os:String="Unknown OS", email:String):String{
    val message = "There's a new sign-in request on $os for your Google Account $email."
    return message
}