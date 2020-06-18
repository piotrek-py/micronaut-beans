package guild.kotlin.micronaut.beans

import io.micronaut.runtime.http.scope.RequestScope
import kotlin.random.Random

@RequestScope
open class RequestScopeBean {
    open val value = Random.nextInt()
}