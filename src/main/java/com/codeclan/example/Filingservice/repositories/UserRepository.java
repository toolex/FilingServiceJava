package com.codeclan.example.Filingservice.repositories;

import com.codeclan.example.Filingservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
