package com.ebarrab.cliente_rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.net.URL;
import java.util.ArrayList;

// Documentación Lombok
// https://projectlombok.org/features/

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke2 {
    private ArrayList<String> categories;
    private String createdAt;
    private URL iconUrl;
    private String id;
    private String updatedAt;
    private URL url;
    private String value;
}

