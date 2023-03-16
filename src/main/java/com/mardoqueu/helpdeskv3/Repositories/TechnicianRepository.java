package com.mardoqueu.helpdeskv3.Repositories;

import com.mardoqueu.helpdeskv3.domain.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician, Integer> {
}
