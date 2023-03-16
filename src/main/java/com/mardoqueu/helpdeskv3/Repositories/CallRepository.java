package com.mardoqueu.helpdeskv3.Repositories;

import com.mardoqueu.helpdeskv3.domain.Call;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRepository extends JpaRepository<Call, Integer> {
}
