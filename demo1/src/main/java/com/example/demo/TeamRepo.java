package com.example.demo;

import com.example.demo.enitity.Commit;
import com.example.demo.enitity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team,Long> {
}
