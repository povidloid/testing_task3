class question(cipher: String, theme: String, description: String, word: String) {
    var qCipher: String = cipher
    var qTheme: String = theme
    var qDescription: String = description
    var qWord: String = word
    override fun toString(): String {
        return "Тема: $qTheme\nОписание: $qDescription"
    }

}