package guild.kotlin.micronaut.aop

import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Inject

@MicronautTest
class TimedTest {
    @Inject
    lateinit var calculator: Calculator

    private val logger: Logger = LoggerFactory.getLogger(TimedTest::class.java)

    @Test
    fun testLogging() {
        logger.info(calculator.multiply(1,2).toString())
    }
}