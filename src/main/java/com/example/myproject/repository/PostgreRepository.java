package com.example.myproject.repository;

import com.example.myproject.entity.PostgreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgreRepository extends JpaRepository<PostgreEntity, Long> {
}
