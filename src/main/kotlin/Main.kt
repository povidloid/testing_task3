import java.util.Scanner

val g = game()

fun main() {
    firstProgramBlock()
}
fun startMenu(){
    print("Добро пожаловать в игру \"Поле чудес\"!\"" +
            "\n 1. Начать игру" +
            "\n 2. Выход")
}
fun yourChoiceMessage(): Int {
    print("\n\nВаш выбор: ")
    return Scanner(System.`in`).nextInt()
}
fun firstProgramBlock(){
    startMenu()
    val choice = yourChoiceMessage()
    when (choice){
        1 -> secondProgramBlock()
        2 -> {
            print("exit")
            System.exit(0)
        }
        else ->
            print("incorrect enter")
    }
}
fun secondProgramBlock(){
    val q = g.questionList[(1..3).random()]
    print("\n\n---Игра началась!---\n\n" + q.toString())
    while (g.moveCounter < 3){
        print("\nСлово: " + q?.qCipher)
        print("\nСчет: " + g.score)
        print("\nОсталось ходов: " + (3 - g.moveCounter))
        print("\n\n 1. Угадать букву\n 2. Угадать слово\n")
        print("\nВаш выбор: ")

        val choice = Scanner(System.`in`).nextInt()
        when (choice) {
            1 -> {
                g.spinDrum((1..3).random())
                g.checkLetter(q!!)
                g.moveCounter += 1
            }
            2 -> {
                print("2")
                g.moveCounter += 9999
            }
            else -> print("incorrect enter")
        }
    }
    print("\n\n\nGame over.\n\n\n")
    Thread.sleep(1000)
    main()
}