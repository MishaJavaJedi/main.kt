import org.junit.Test
import kotlin.test.assertEquals

internal class MainKtTest{
    @Test
    fun masterCardTest(){
        val cardType = "MasterCard"
        val amount = 2_000_000
        val recentPayments = 8_000_000
        val expectedResult = 12020
        val actualResult = result(cardType,amount, recentPayments)
        assertEquals(expectedResult,actualResult)
    }

    @Test
    fun maestroCardTestTrue(){
        val cardType = "Maestro"
        val amount = 2_000_000
        val recentPayments = 8_000_000
        val expectedResult = 12020
        val actualResult = result(cardType,amount, recentPayments)
        assertEquals(expectedResult,actualResult)
    }
    @Test
    fun maestroCardTestFalse(){
        val cardType = "Maestro"
        val amount = 2_000_000
        val recentPayments = 3_000_000
        val expectedResult = 0
        val actualResult = result(cardType,amount, recentPayments)
        assertEquals(expectedResult,actualResult)
    }

    @Test
    fun mirFalseTest(){
        val cardType = "Mir"
        val amount = 2_000_000
        val expectedResult = 15_000
        val actualResult = result(cardType,amount)
        assertEquals(expectedResult,actualResult)
    }
    @Test
    fun mirTrueTest(){
        val cardType = "Mir"
        val amount = 20_000
        val expectedResult = 3500_0 //
        val actualResult = result(cardType,amount)
        assertEquals(expectedResult,actualResult)
    }
    @Test
    fun visaTest(){
        val cardType = "Visa"
        val amount = 2_000_000
        val expectedResult = 15_000
        val actualResult = result(cardType,amount)
        assertEquals(expectedResult,actualResult)
    }
    @Test
    fun vkPayTest(){
        val cardType = "VkPay"
        val expectedResult = 0
        val actualResult = result(cardType)
        assertEquals(expectedResult,actualResult)
    }
    @Test
    fun exceptionCatchingTest(){
        val cardType = "Invalid"
        val expectedResult = 0
        val actualResult = result(cardType)
        assertEquals(expectedResult,actualResult)
    }






}