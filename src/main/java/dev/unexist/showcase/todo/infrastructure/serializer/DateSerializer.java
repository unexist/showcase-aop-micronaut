/**
 * @package Showcase-AOP-Micronaut
 *
 * @file Todo serializer
 * @copyright 2021-present Christoph Kappel <christoph@unexist.dev>
 * @version $Id$
 *
 * This program can be distributed under the terms of the Apache License v2.0.
 * See the file LICENSE for details.
 **/

package dev.unexist.showcase.todo.infrastructure.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateSerializer extends JsonSerializer<LocalDate> {
    public static final String PATTERN = "yyyy-MM-dd";

    /**
     * Serialize {@link LocalDate} to format
     *
     * @param  value        Value to convert
     * @param  gen          A {@link JsonGenerator}
     * @param  serializers  A {@link SerializerProvider}
     * @throws IOException
     **/

    @Override
    public void serialize(LocalDate value, JsonGenerator gen,
                          SerializerProvider serializers) throws IOException {
        gen.writeString(value.format(DateTimeFormatter.ofPattern(PATTERN)));
    }
}
