package blackjack

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class BlackJackService {
    fun splitInput(input: String): List<String> {
        return input.split(",")
    }
}

class BlackJackServiceTest : StringSpec ({
    "사용자의 입력값을 쉼표 기준으로 분리한다." {
        val blackJackService = BlackJackService()
        val input = "kim,da"
        val result = blackJackService.splitInput(input)
        result shouldBe listOf("kim", "da")
    }
})