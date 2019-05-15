package me.bong.kogilespringbootjpa.Project;

import me.bong.kogilespringbootjpa.Account.Account;
import me.bong.kogilespringbootjpa.Account.AccountRepostiroy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProjectRestControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired


    @Test
    public void findByAccount() throws Exception {
        mockMvc.perform(get("/find/projects/bong"))
                .andExpect(status().isOk())
                .andExpect(content().string("sample"));
    }

}