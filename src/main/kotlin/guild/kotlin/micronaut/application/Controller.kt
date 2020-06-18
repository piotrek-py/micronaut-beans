package guild.kotlin.micronaut.application

import guild.kotlin.micronaut.beans.*
import io.micronaut.context.ApplicationContext
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope

@Controller
open class Controller(
    val applicationContext: ApplicationContext
) {
    @Get("/singleton")
    open suspend fun singletonRequest(): List<Int> {
        val results = (1..10).map {
            val bean = applicationContext.getBean(SingletonBean::class.java)
            bean.value
        }
        return results
    }

    @Get("/prototype")
    open fun prototypeRequest(): List<Int> {
        val results = (1..10).map {
            val bean = applicationContext.getBean(PrototypeBean::class.java)
            bean.value
        }
        return results
    }

    @Get("/refreshable")
    open fun refreshableRequest(): List<Int> {
        val results = (1..10).map {
            val bean = applicationContext.getBean(RefreshableBean::class.java)
            bean.value
        }
        return results
    }

    @Get("/thread-local")
    open fun threadLocalRequest(): List<Int> {
        val results = (1..10).map {
            val bean = applicationContext.getBean(ThreadLocalBean::class.java)
            bean.value
        }
        return results
    }

    @Get("/thread-local2")
    open suspend fun threadLocalRequest2(): List<Int> {
        val results = (1..10).map {
            coroutineScope {
                async {
                    val bean = applicationContext.getBean(ThreadLocalBean::class.java)
                    bean.value
                }
            }
        }
        return results.awaitAll()
    }

    @Get("/request-scope")
    open fun requestScope(): List<Int> {
        val results = (1..10).map {
            val bean = applicationContext.getBean(RequestScopeBean::class.java)
            bean.value
        }
        return results
    }

    @Get("/request-scope2")
    open suspend fun requestScope2(): List<Int> {
        val results = (1..10).map {
            coroutineScope {
                async {
                    val bean = applicationContext.getBean(RequestScopeBean::class.java)
                    bean.value
                }
            }
        }
        return results.awaitAll()
    }
}
