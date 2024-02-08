package com.ebarrab.cliente_rest.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke {
    //    private ArrayList<String> categories;
    private String created_at;
//    private URL iconUrl;
//    private String id;
//    private String updatedAt;
//    private URL url;
//    private String value;

    public String getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(String createdAt) {
        this.created_at = createdAt;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "created_at='" + created_at + '\'' +
                '}';
    }
}
