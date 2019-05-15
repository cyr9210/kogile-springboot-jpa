package me.bong.kogilespringbootjpa.Project.post.checklist;

import lombok.Data;
import me.bong.kogilespringbootjpa.Project.post.Post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Checklist {

    @Id @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    private Post post;


}
