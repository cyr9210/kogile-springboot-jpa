package me.bong.kogilespringbootjpa.Project;

import lombok.Data;
import me.bong.kogilespringbootjpa.Account.Account;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Project {

    @Id @GeneratedValue
    private Long id;

    private String title;

    private String content;

    @ManyToOne
    private Account createdBy;

    @OneToMany
    private List<Account> participatant = new ArrayList<>();

    @Temporal(TemporalType.DATE)
    private Date created;

    @Temporal(TemporalType.DATE)
    private Date updated;

    @PrePersist
    public void prePersist(){
        this.created = new Date();
    }

    @PreUpdate
    public void preUpdate(){
        this.updated = new Date();
    }
}
