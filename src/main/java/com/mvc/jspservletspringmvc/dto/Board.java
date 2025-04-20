package com.mvc.jspservletspringmvc.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Board {
    @NotNull(message = "ID EMPTY")
    protected int id;
    protected String author;
    protected String title;
    protected String body;
    protected Date date;
}
