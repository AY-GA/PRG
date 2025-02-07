package lekce_12

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.PropertyAccessor
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper

open class Zvire2(val jmeno: String) {
    protected var isAlive: Boolean = false

    companion object {
        @Throws(JsonProcessingException::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val k = Kocka("Mikes")
            val h = Had("Nagini")

            val mapper1 = ObjectMapper()
            val mapper2 = XmlMapper()
            val mapper3 = YAMLMapper()

            mapper1.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
            mapper2.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
            mapper3.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
            mapper1.enable(SerializationFeature.INDENT_OUTPUT)
            mapper2.enable(SerializationFeature.INDENT_OUTPUT)
            mapper3.enable(SerializationFeature.INDENT_OUTPUT)

            println(mapper1.writeValueAsString(k))
            println(mapper2.writeValueAsString(k))
            println(mapper3.writeValueAsString(k))
        }
    }
}