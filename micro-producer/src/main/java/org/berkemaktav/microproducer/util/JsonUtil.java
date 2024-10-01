package org.berkemaktav.microproducer.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@UtilityClass
public class JsonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final Gson gson = new Gson();

    public static String serialize(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            errorLog(e);
            return gson.toJson(object);
        }
    }

    public static <T> T deserialize(String jsonString, Class<T> clazz) {
        try {
            return objectMapper.readValue(jsonString, clazz);
        } catch (Exception e) {
            errorLog(e);
            return gson.fromJson(jsonString, clazz);
        }
    }

    private static void errorLog(Exception e) {
        log.error("ObjectMapper failed, trying Gson. Error: {}", e.getMessage());
    }
}