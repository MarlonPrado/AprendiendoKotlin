fun main () {
    val timeSpentToday = 320
    val timeSpentYesterday  = 300
    println(timeSpentMobile(timeSpentToday,timeSpentYesterday))
}

fun timeSpentMobile(timeSpentToday: Int,timeSpentYesterday: Int): Boolean {
    if(timeSpentToday>timeSpentYesterday){
        return true
    }
    else{
        return false
    }
}

