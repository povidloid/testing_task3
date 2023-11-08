import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class gameTest{
    @Test
    fun spinDrum_test1(){
        val g = game()
        val a = 1
        val res = g.spinDrum(a)
        assertEquals(100, res)
    }
    @Test
    fun spinDrum_test2(){
        val g = game()
        val a = 2
        val res = g.spinDrum(a)
        assertEquals(200, res)
    }
    @Test
    fun spinDrum_test3(){
        val g = game()
        val a = 3
        val res = g.spinDrum(a)
        assertEquals(300, res)
    }
    @Test
    fun spinDrum_test4(){
        val g = game()
        val a = 4
        val res = g.spinDrum(a)
        assertEquals(400, res)
    }
    @Test
    fun spinDrum_test5(){
        val g = game()
        val a = 5
        val res = g.spinDrum(a)
        assertEquals(500, res)
    }
    @Test
    fun spinDrum_test6(){
        val g = game()
        val a = 6
        val res = g.spinDrum(a)
        assertEquals(600, res)
    }
}