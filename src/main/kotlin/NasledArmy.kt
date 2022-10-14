/**
 *  expirence - Переменная отвечающая за значение введённое с клавиатуры
 *  Qp - Переменная в которую перейдёт значение из функции QpForm
 * @param QpForm - Функция отвечающая за нахождение переменной Qp
 * @return Qp - возвращение значения из функции QpForm
 * @param ArmyInfo - переопределённая функция, которая выводит всю информацию
 */
class NasledArmy(marka : String,mosh:String,mesta:String,godIz:String): Army(marka,mosh,mesta)
{
    val expirence: String
    init
    {
        expirence = godIz
    }
    var Qp: Double = 0.0

    fun QpForm(): Double
    {
        Qp = Qp + kompFormul()*(expirence.toInt()+1)
        return Qp
    }
    override fun ArmyInfo()
    {
        super.ArmyInfo()
        println("Опыт: ${expirence}")
        println("Формула 2: ${QpForm()}")
    }

}