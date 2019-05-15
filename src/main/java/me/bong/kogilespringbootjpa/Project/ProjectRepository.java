package me.bong.kogilespringbootjpa.Project;

import me.bong.kogilespringbootjpa.Account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findAllByParticipatant_Id(String id);
}
