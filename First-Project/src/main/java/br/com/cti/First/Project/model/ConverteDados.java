package br.com.cti.First.Project.model;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ConverteDados {
    private final ObjectMapper objectMapper;

    public ConverteDados() {
        this.objectMapper = new ObjectMapper();
    }

    public <T> T obterDados(String json, Class<T> clazz) throws Exception {
        return objectMapper.readValue(json, clazz);
    }
}