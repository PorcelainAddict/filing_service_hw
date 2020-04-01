package com.example.filingsystem.filingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "project")
    private String project;

    @OneToMany(mappedBy = "folder")

    @JsonIgnoreProperties("folders")
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private List<File> files;

    public Folder(String project, User user) {
        this.project = project;
        this.user = user;
        this.files = new ArrayList<File>();
    }

    public Folder(){

    }

    public Long getId() {
        return id;
    }

    public User getUser(){
        return user;
    }


    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFiles(File file){
        this.files.add(file);
    }
}
