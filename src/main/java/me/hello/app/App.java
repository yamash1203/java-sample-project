package me.hello.app;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        JsonFactory factory = new JsonFactory();
        try (
            Writer out = new StringWriter();
            JsonGenerator generator = factory.createGenerator(out);
        ) {
            generator.writeStartObject();
            generator.writeStringField("message", "Hello World!");
            generator.writeEndObject();
            generator.flush();
            System.out.println(out.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
