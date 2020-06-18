package guild.kotlin.micronaut.beans

import io.micronaut.runtime.context.scope.ThreadLocal
import kotlin.random.Random

@ThreadLocal
open class ThreadLocalBean {
    open val value = Random.nextInt()
}