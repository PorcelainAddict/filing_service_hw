package com.example.filingsystem.filingservice.repositories;

import com.example.filingsystem.filingservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
