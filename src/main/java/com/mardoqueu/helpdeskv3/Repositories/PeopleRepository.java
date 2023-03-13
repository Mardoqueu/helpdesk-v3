package com.mardoqueu.helpdeskv3.Repositories;

import com.mardoqueu.helpdeskv3.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Integer> {
}
