package guild.kotlin.micronaut.application

import io.micronaut.runtime.Micronaut

object App {

    @JvmStatic
    fun main(args: Array<String>) {
        System.out.println("Starting sample application...")

        Micronaut.build()
            .mainClass(App.javaClass)
            .start()
    }
}
