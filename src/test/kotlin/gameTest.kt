import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class gameTest{
    @Test
    fun spinDrum_test1(){
        val g = game()
        val a = 1
        g.spinDrum(a)
        assertEquals(100, g.point)
    }
    @Test
    fun spinDrum_test2(){
        val g = game()
        val a = 2
        g.spinDrum(a)
        assertEquals(200, g.point)
    }
    @Test
    fun spinDrum_test3(){
        val g = game()
        val a = 3
        g.spinDrum(a)
        assertEquals(300, g.point)
    }
    @Test
    fun spinDrum_test4(){
        val g = game()
        val a = 4
        g.spinDrum(a)
        assertEquals(400, g.point)
    }
    @Test
    fun spinDrum_test5(){
        val g = game()
        val a = 5
        g.spinDrum(a)
        assertEquals(500, g.point)
    }
    @Test
    fun openLetters_test1(){
        val g = game()
        val q = g.questionList[1]
        val letter = 'к'
        g.openLetters(q!!, letter)
        assertEquals("к##", q.qCipher)
    }
    @Test
    fun openLetters_test2(){
        val g = game()
        val q = g.questionList[1]
        val letter = 'о'
        g.openLetters(q!!, letter)
        assertEquals("#о#", q.qCipher)
    }
    @Test
    fun openLetters_test3(){
        val g = game()
        val q = g.questionList[1]
        val letter = 'т'
        g.openLetters(q!!, letter)
        assertEquals("##т", q.qCipher)
    }
}