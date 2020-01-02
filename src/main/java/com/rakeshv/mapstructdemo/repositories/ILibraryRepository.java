package com.rakeshv.mapstructdemo.repositories;

import com.rakeshv.mapstructdemo.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ILibraryRepository extends JpaRepository<Library, UUID> {
}
