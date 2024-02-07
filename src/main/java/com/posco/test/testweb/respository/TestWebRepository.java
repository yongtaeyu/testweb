package com.posco.test.testweb.respository;

import com.posco.test.testweb.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestWebRepository extends JpaRepository<Job, Long> {}
