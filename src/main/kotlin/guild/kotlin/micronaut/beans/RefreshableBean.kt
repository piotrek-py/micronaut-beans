package guild.kotlin.micronaut.beans

import io.micronaut.runtime.context.scope.Refreshable
import kotlin.random.Random

@Refreshable("bean")
open class RefreshableBean {
    open val value = Random.nextInt()
}