package me.bong.kogilespringbootjpa.Project.post.label;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Label {

    @Id @GeneratedValue
    private Long id;

    private String collor;

    private String content;



}
