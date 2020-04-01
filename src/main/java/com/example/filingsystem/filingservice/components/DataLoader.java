package com.example.filingsystem.filingservice.components;

import com.example.filingsystem.filingservice.models.File;
import com.example.filingsystem.filingservice.models.Folder;
import com.example.filingsystem.filingservice.models.User;
import com.example.filingsystem.filingservice.repositories.FileRepository;
import com.example.filingsystem.filingservice.repositories.FolderRepository;
import com.example.filingsystem.filingservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {

        User Alan = new User("Alan");
        userRepository.save(Alan);
        Folder folderSecretPlans = new Folder("Secret Plans", Alan);
        folderRepository.save(folderSecretPlans);
        File secret = new File("Secret", "super", 520, folderSecretPlans);
        fileRepository.save(secret);
    }
}
