package com.codeclan.example.Filingservice.repositories;

import com.codeclan.example.Filingservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
