package com.example.filingsystem.filingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size")
    private int size;

    @JsonIgnoreProperties("files")
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;


    public File(String fileName, String extension, int size, Folder folder) {
        this.fileName = fileName;
        this.extension = extension;
        this.size = size;
        this.folder = folder;

    }


    public File(){

    }

    public Folder getFolder(){
        return folder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
