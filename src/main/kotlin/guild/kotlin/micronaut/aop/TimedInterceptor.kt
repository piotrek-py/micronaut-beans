package guild.kotlin.micronaut.aop

import io.micronaut.aop.MethodInterceptor
import io.micronaut.aop.MethodInvocationContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Singleton
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@Singleton
class TimedInterceptor : MethodInterceptor<Any, Any> {
    private val logger: Logger = LoggerFactory.getLogger(TimedInterceptor::class.java)

    @ExperimentalTime
    override fun intercept(context: MethodInvocationContext<Any, Any>): Any {
        val result = measureTimedValue {
            context.proceed()
        }
        logger.trace("invocation of ${context.executableMethod.declaringType}.${context.methodName} " +
                "taken ${result.duration.inMilliseconds} ms")
        return result.value
    }
}