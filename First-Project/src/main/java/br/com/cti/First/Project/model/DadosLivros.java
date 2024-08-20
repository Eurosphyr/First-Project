package br.com.cti.First.Project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosLivros {
    private Map<String, Book> books = new HashMap<>();

    public Map<String, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<String, Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "DadosLivros{" +
                "books=" + books +
                '}';
    }
}