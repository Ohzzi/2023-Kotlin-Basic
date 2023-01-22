package view

import domain.Color
import domain.JudgementTile
import domain.Wordle

fun inputPrediction(): String {
    println("정답을 입력해주세요.")
    return readln()
}

fun printStartMessage() {
    println(
        """
        WORDLE을 ${Wordle.MAX_ROUND}번 만에 맞춰 보세요.
        시도의 결과는 타일의 색 변화로 나타납니다.
        """.trimIndent()
    )
}

fun printTiles(judgementTiles: List<JudgementTile>) {
    judgementTiles.forEach(::printTile)
}

private fun printTile(judgementTile: JudgementTile) {
    judgementTile.colors
        .forEach(::printColor)
    println()
}

private fun printColor(color: Color) {
    when (color) {
        Color.GRAY -> print("⬜")
        Color.YELLOW -> print("🟨")
        Color.GREEN -> print("🟩")
    }
}

fun printTryCount(currentRound: Int) {
    println("$currentRound/${Wordle.MAX_ROUND}")
}
