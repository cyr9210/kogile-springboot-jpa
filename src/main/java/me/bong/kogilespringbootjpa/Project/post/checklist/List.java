package me.bong.kogilespringbootjpa.Project.post.checklist;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class List {

    @Id @GeneratedValue
    private Long id;

    private String listTitle;

    private boolean checked = false;

    @ManyToOne
    private Checklist checklist;

}
