package sample

import kotlin.test.Test
import kotlin.test.assertTrue

abstract class BaseSampleTests {
    @Test
    fun testMe() {
        assertTrue(Sample().checkMe() > 0)
    }
}
