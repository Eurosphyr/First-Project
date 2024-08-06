package br.com.cti.First.Project.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Book(
    @JsonAlias("url") String url,
    @JsonAlias("key") String key,
    @JsonAlias("title") String title,
    @JsonAlias("authors") List<Author> authors,
    @JsonAlias("number_of_pages") int numberOfPages,
    @JsonAlias("identifiers") Map<String, List<String>> identifiers,
    @JsonAlias("classifications") Map<String, List<String>> classifications,
    @JsonAlias("publishers") List<Publisher> publishers,
    @JsonAlias("publish_date") String publishDate,
    @JsonAlias("subjects") List<Subject> subjects,
    @JsonAlias("cover") Cover cover
) {}
