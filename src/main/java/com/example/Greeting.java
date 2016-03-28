package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by nano on 17/03/16.
 */
public class Greeting {

    private final long id;
    private final String content;
    private Greeting parent;

    public Greeting(long id, String content) {
        this(id, content, null);
    }

    public Greeting(long id, String content, Greeting greeting) {
        this.id = id;
        this.content = content;
        this.parent = greeting;
    }

    public long getId() {
        return id;
    }

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "The name of the user", required = true)
    public String getContent() {
        return content;
    }

    @JsonProperty
    @ApiModelProperty(notes = "Self Ref")
    public Greeting getParent() {
        return parent;
    }

    public void setParent(Greeting parent) {
        this.parent = parent;
    }
}