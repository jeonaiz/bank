package com.example.bank.repositories;

import com.example.bank.models.Nominal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NominalRepo extends JpaRepository<Nominal, Long> {
}
