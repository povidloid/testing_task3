class game {
    private val points = mapOf(
        1 to 100,
        2 to 200,
        3 to 300,
        4 to 400,
        5 to 500,
        6 to 600)

    fun spinDrum(a: Int): Int {
        return points[a] ?: 0
    }
}