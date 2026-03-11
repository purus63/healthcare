package com.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.healthcare.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}