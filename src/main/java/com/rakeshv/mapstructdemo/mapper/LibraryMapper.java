package com.rakeshv.mapstructdemo.mapper;

import com.rakeshv.mapstructdemo.models.Library;
import com.rakeshv.mapstructdemo.models.LibraryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring", uses = {BookMapper.class})
public interface LibraryMapper extends IEntityMapper<LibraryDTO, Library> {
    @Mapping(source = "books", target = "bookDTOs")
    LibraryDTO toDto(final Library library);

    Library toEntity(final LibraryDTO libraryDTO);

    default Library fromId(final UUID id) {

        if (id == null) {
            return null;
        }

        final Library library=new Library();

        library.setId(id);

        return library;
    }
}
