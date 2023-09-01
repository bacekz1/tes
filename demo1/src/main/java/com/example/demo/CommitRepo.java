package com.example.demo;

import com.example.demo.enitity.Commit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommitRepo extends JpaRepository<Commit, Long> {

}
