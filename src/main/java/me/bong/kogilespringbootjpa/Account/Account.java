package me.bong.kogilespringbootjpa.Account;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Account {

    @Id
    private String id;

    private String username;

    private String password;


}
