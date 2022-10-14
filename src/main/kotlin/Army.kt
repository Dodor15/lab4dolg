/**
 *  typeOfTroops - Инициализированная переменная со значением из конструктара Army()
 *  strength - Инициализированная переменная со значением из конструктара Army()
 *  armament - Инициализированная переменная со значением из конструктара Army()
 * @param kompFormul -  Функция отвечающая за нахождение переменной q
 * @return q - возвращение значения из функции kompFormul
 * @param ArmyInfo - переопределённая функция, которая выводит всю информацию
 */
open class Army(typeoftroops : String,srength:String,armament:String)

{
    val TypeOfTroops: String
    val Strength: String
    val Armament : String
    init
    {
        TypeOfTroops = typeoftroops
        Strength = srength
        Armament = armament

    }
    fun kompFormul(): Double
    {
        var q: Double = 0.1*Strength.toInt()*Armament.toInt()
        return q
    }
    open fun ArmyInfo()
    {
        println("Вид войск: ${TypeOfTroops} ")
        println("Сила войск: ${Strength} ")
        println("Вооружённость: ${Armament}")
        println("Формула 1: ${kompFormul()}")

    }


}