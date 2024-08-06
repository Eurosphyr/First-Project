package br.com.cti.First.Project.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cover {
    @JsonAlias("small") private String small;
    @JsonAlias("medium") private String medium;
    @JsonAlias("large") private String large;

    // Getters and setters

    @Override
    public String toString() {
        return "Cover{" +
                "small='" + small + '\'' +
                ", medium='" + medium + '\'' +
                ", large='" + large + '\'' +
                '}';
    }
}
