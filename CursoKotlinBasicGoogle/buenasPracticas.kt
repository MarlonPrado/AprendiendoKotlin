/**
 * 
 * CODIGO ANTIGUO
 * 
 * fun main() {
    val Steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
 */

fun main() {
    val step = 4000
    val caloriesBurned = pedometerCalory(step);
    println("Walking $step steps burns $caloriesBurned calories")
}

fun pedometerCalory(step: Int): Double {
    val stepCalory = 0.04
    val TotalCalory = step * stepCalory
    return TotalCalory
}