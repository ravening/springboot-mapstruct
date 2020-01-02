package com.rakeshv.mapstructdemo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO implements Serializable {
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String author;

    @NotNull
    private LocalDateTime publishedDate;

    private UUID libraryId;
}
