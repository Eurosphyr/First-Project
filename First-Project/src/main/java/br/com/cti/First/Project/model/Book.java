package br.com.cti.First.Project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Book(
    String url,
    String key,
    String title,
    List<Author> authors,
    Integer number_of_pages,
    Map<String, List<String>> identifiers,
    Map<String, List<String>> classifications,
    List<Publisher> publishers,
    String publish_date,
    List<Subject> subjects,
    Cover cover
) {}