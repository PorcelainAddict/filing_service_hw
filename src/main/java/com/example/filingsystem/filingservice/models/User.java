package com.example.filingsystem.filingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @JsonIgnoreProperties("users")
    @OneToMany(mappedBy = "user")
    private List<Folder> folders;

    public User(String userName) {
        this.userName = userName;
        this.folders = new ArrayList<Folder>();
    }

    public User(){

    }

    public Long getId() {
        return id;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public void addFolder(Folder folder){
        this.folders.add(folder);
    }
}
