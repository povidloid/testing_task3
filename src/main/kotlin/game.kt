import java.util.Scanner

class game {
    private val points = mapOf(
        1 to 100,
        2 to 200,
        3 to 300,
        4 to 400,
        5 to 500,
        6 to 600)

    val questionList = mapOf(
        1 to question("###", "Животные", "Его обожают все люди", "кот"),
        2 to question("#######", "Еда", "Зеленый фрукт с большой косточкой", "авокадо"),
        3 to question("####", "Космос", "Сияет ярче всех ночью", "луна")
    )

    var score = 0
    var moveCounter = 0
    var point = 0

    fun spinDrum(a: Int) {
        print("\nКрутится барабан...")
        Thread.sleep(700)
        print("\nВыпало число: " + points[a])
        point = points[a]!!
    }
    fun checkLetter(q: question){
        print("\nВведите букву: ")
        val a = Scanner(System.`in`).next()
        if (q.qWord.contains(a)) {
            score += point
            point = 0
            print("Верно!\n")
            openLetters(q, a[0])
        }
        else {
            point = 0
            print("Неверно...\n")
        }
    }
    fun openLetters(q: question, a: Char){
        for ( (i, e) in q.qWord.withIndex()){
            if (e == a){
                q.qCipher = q.qCipher.substring(0, i) + a + q.qCipher.substring(i + 1)
            }
        }
    }
}