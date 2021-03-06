package me.bong.kogilespringbootjpa.Project.post;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Post {

    @Id @GeneratedValue
    private Long id;

    private String title;

    private String description;

    private int level;


}
