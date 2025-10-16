package lekce_12;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class Zvire {
    private String jmeno;
    protected boolean isAlive;

    public String getJmeno() {
        return jmeno;
    }

    public Zvire(String jmeno) {
        this.jmeno = jmeno;
    }

    public static void main(String[] args) throws JsonProcessingException {
        Kocka k = new Kocka("Mikes");
        Had h = new Had("Nagini");

        ObjectMapper mapper1 = new ObjectMapper();
        XmlMapper mapper2 = new XmlMapper();
        YAMLMapper mapper3 = new YAMLMapper();

        mapper1.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper2.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper3.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper1.enable(SerializationFeature.INDENT_OUTPUT);
        mapper2.enable(SerializationFeature.INDENT_OUTPUT);
        mapper3.enable(SerializationFeature.INDENT_OUTPUT);

        System.out.println(mapper1.writeValueAsString(k));
        System.out.println(mapper2.writeValueAsString(k));
        System.out.println(mapper3.writeValueAsString(k));
    }
}
