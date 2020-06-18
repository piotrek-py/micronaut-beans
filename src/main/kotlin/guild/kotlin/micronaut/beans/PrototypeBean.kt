package guild.kotlin.micronaut.beans

import io.micronaut.context.annotation.Prototype
import kotlin.random.Random

@Prototype
open class PrototypeBean {
    open val value = Random.nextInt()
}