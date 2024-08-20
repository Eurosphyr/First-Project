package br.com.cti.First.Project.model;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    public ConverteDados() {
        this.mapper = new ObjectMapper();
    }

    public <T> T obterDados(String json, Class<T> clazz) throws Exception {
        try {
            return this.mapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}