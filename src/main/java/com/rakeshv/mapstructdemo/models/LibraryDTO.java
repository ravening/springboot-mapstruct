package com.rakeshv.mapstructdemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibraryDTO implements Serializable {
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private List<BookDTO> bookDTOs = new ArrayList<>();
}
