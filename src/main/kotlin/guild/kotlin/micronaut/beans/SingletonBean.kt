package guild.kotlin.micronaut.beans

import javax.inject.Singleton
import kotlin.random.Random

@Singleton
open class SingletonBean {
    open val value = Random.nextInt()
}