package me.bong.kogilespringbootjpa.Project;

import me.bong.kogilespringbootjpa.Account.Account;
import me.bong.kogilespringbootjpa.Account.AccountRepostiroy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProjectRepositoryTest {

    @Autowired
    ProjectRepository project;

    @Autowired
    AccountRepostiroy accountRepostiroy;

    @Test
    public void findAllByParticapatant(){
        //given
        Account account1 = saveAccount("bong");
        Account account2 = saveAccount("choi");

        Project project1 = new Project();
        project1.setTitle("sample");
        project1.setContent("content");
        project1.setCreatedBy(account1);
        project1.getParticipatant().add(account1);
        project1.getParticipatant().add(account2);

        //when
        Project savedProject = project.save(project1);
        List<Project> findByChoi = project.findAllByParticipatant_Id("choi");

        //then
        assertThat(findByChoi).contains(savedProject);

    }

    private Account saveAccount(String id) {
        Account account1 = new Account();
        account1.setId(id);
        return accountRepostiroy.save(account1);
    }

}