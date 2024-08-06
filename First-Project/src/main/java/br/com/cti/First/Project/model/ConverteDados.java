package br.com.cti.First.Project.model;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public <T> T obterDados(String json, Class<T> clazz) throws Exception {
        return objectMapper.readValue(json, clazz);
    }
}