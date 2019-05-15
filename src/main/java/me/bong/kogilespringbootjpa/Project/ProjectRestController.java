package me.bong.kogilespringbootjpa.Project;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProjectRestController {
    private  final ProjectService projectService;

    @GetMapping("/find/projects/{id}")
    public void findAllAccount_id(@PathVariable String id){
        projectService.findByAccount(id);
    }
}
