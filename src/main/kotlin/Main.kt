fun main() {
    val spider = Spider()
    var stringInput = ""
    while (stringInput != "e") {
        print("press b for blink, s for stare, n for normal, or e to exit the program\n")
        stringInput = readLine()!!
        when (stringInput) {
            "b" -> spider.see("_ ")
            "s" -> spider.see("""👁️""")
            "n" -> spider.see("0 ")
            else -> spider.see(("$stringInput  ").substring(0, 2))
        }
    }
}

class Spider {
    private val normalEye = "0 "
    private val emojiEye: String = """👁️"""
    private val blinkEye = "_ "
    private var eye: String = normalEye

    private val spider: (() -> String) = {
        """
                             |
                             |
                             |
                             |
                             |
                             |
                             |
                         _ ----- _
                    .-~             ~-.
                   /       $eye  $eye       \
        .-- -- -- |        $eye  $eye        | -- -- --.
    .-~ / ~~ ~~ ~~ \       $eye  $eye       / ~~ ~~ ~~ \ ~-.
.-~   /        _ - ~ ~-.   $eye  $eye   .-~ ~ - _        \   ~-.
    /      /~          /  ~ ----- ~  \          ~\      \
   /      /           /               \           \       \
         /           /                 \           \
        /           /                   \           \
       /           |                     |           \
                   |                     |
                   |                     |
                   |                     |
                   |                     |
    """
    }

    fun blink() {
        eye = blinkEye
        print(spider())
    }

    fun look() {
        eye = normalEye
        print(spider())
    }

    fun stare() {
        eye = emojiEye
        print(spider())
    }

    fun see(input: String) {
        eye = input
        print(spider())
    }
}