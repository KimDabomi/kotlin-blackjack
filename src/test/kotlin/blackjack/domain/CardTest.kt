package blackjack.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CardTest : StringSpec({
    "카드를 생성한다." {
        val card = Card()
        card.cardList.size shouldBe 52
    }

    "카드를 한 장 뽑는다." {
        val card = Card()
        val drawnCards = card.drawCards(1)
        drawnCards.size shouldBe 1
        card.cardList.size shouldBe 51
    }


})
