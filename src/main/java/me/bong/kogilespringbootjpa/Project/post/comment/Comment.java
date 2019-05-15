package me.bong.kogilespringbootjpa.Project.post.comment;

import lombok.Data;
import me.bong.kogilespringbootjpa.Project.post.Post;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Comment {
    @Id @GeneratedValue
    private String id;

    private String comment;

    @OneToMany
    private List<Comment> comments;

    @ManyToOne
    private Post post;
}
