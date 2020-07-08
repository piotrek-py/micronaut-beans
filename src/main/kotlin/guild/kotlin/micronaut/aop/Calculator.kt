package guild.kotlin.micronaut.aop

import javax.inject.Singleton

@Singleton
open class Calculator {
    @Timed
    open fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}