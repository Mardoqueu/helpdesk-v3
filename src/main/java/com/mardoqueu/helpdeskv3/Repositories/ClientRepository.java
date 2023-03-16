package com.mardoqueu.helpdeskv3.Repositories;

import com.mardoqueu.helpdeskv3.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
