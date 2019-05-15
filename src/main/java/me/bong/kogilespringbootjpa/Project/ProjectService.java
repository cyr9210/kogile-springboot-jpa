package me.bong.kogilespringbootjpa.Project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public void findByAccount(String Account_id){
        projectRepository.findAllByParticipatant_Id(Account_id);
    }

}
