/**
 *@constructor Описание первичного конструктора класса val Army: Army = Army()
 * Army.ArmyInfo() - Вызов свойств и параметров объекта класса Army
 * @constructor Описание вторичного конструктора класса val Qp: NasledArmy = NasledArmy()
 * Qp.ArmyInfo() - Вызов свойств и параметров объекта класса NasledAvto
 */
fun main() {
    println("Введите информацию в 1-й класс")
    val Army: Army = Army(readLine().toString(),readLine().toString(),readLine().toString())
    println("Вывод информации 1-го класса")
    Army.ArmyInfo()
    println("Введите информацию во 2-й класс")
    val Qp: NasledArmy = NasledArmy(readLine().toString(),readLine().toString(),readLine().toString(),readLine().toString())
    println("Вывод информации 2-го класса")
    Qp.ArmyInfo()
}
