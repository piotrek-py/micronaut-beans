package guild.kotlin.micronaut

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class SingletonTest {
    @Inject
    @field:Client("/")
    lateinit var client: RxHttpClient

    @Inject
    lateinit var mapper: ObjectMapper

    @Test
    fun simpleTest() {
        assert(true)
    }

    @Test
    fun singletonTest() {
        val request = HttpRequest.GET<String>("/singleton")
        val results1 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results2 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        assert(results1.distinct().count() == 1)
        assert(results2.distinct().count() == 1)
        assert(results1 != results2)
    }

    @Test
    fun prototypeTest() {
        val request = HttpRequest.GET<String>("/prototype")
        val results1 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results2 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        assert(results1.distinct().count() == 10)
        assert(results2.distinct().count() == 10)
        assert(results1 != results2)
    }

    @Test
    fun refreshableTest() {
        val request = HttpRequest.GET<String>("/refreshable")
        val results1 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results2 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        assert(results1.distinct().count() == 1)
        assert(results2.distinct().count() == 1)
        assert(results1 == results2)
        val request2 = HttpRequest.POST("/refresh", "{\"force\": true}")
        val results3 = client.toBlocking().retrieve(request2)!!
        val results4 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        assert(results2 != results4)
    }

    @Test
    fun threadLocalTest() {
        val request = HttpRequest.GET<String>("/thread-local")
        val results1 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results2 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results3 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results4 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results5 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results6 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results7 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results8 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results9 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results10 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results11 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results12 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results13 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results14 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results15 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results16 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        assert(results1.distinct().count() == 1)
        assert(results2.distinct().count() == 1)
        assert(results3.distinct().count() == 1)
        assert(results4.distinct().count() == 1)
        assert(results5.distinct().count() == 1)
        assert(results6.distinct().count() == 1)
        assert(results7.distinct().count() == 1)
        assert(results8.distinct().count() == 1)
        assert(results9.distinct().count() == 1)
        listOf(results1, results2, results3, results4, results5, results6, results7, results8, results9, results10,
            results11, results12, results13, results14, results15, results16).map {
            it.first()
        }.forEach {
            println(it)
        }
    }

    @Test
    fun threadLocal2Test() {
        val request = HttpRequest.GET<String>("/thread-local2")
        val results1 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results2 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results3 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results4 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results5 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results6 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results7 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results8 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results9 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results10 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results11 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results12 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results13 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results14 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results15 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results16 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        assert(results1.distinct().count() == 1)
        assert(results2.distinct().count() == 1)
        assert(results3.distinct().count() == 1)
        assert(results4.distinct().count() == 1)
        assert(results5.distinct().count() == 1)
        assert(results6.distinct().count() == 1)
        assert(results7.distinct().count() == 1)
        assert(results8.distinct().count() == 1)
        assert(results9.distinct().count() == 1)
        listOf(results1, results2, results3, results4, results5, results6, results7, results8, results9, results10,
            results11, results12, results13, results14, results15, results16).map {
            it.first()
        }.forEach {
            println(it)
        }
    }

    @Test
    fun requestScopeTest() {
        val request = HttpRequest.GET<String>("/request-scope")
        val results1 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results2 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        assert(results1.distinct().count() == 1)
        assert(results2.distinct().count() == 1)
        assert(results1 != results2)
    }


    @Test
    fun requestScope2Test() {
        val request = HttpRequest.GET<String>("/request-scope2")
        val results1 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        val results2 = mapper.readValue(client.toBlocking().retrieve(request)!!, object: TypeReference<List<Int>>(){})!!
        assert(results1.distinct().count() == 1)
        assert(results2.distinct().count() == 1)
        assert(results1 != results2)
    }
}