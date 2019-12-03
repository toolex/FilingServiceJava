package com.codeclan.example.Filingservice.components;

import com.codeclan.example.Filingservice.models.File;
import com.codeclan.example.Filingservice.models.Folder;
import com.codeclan.example.Filingservice.models.User;
import com.codeclan.example.Filingservice.repositories.FileRepository;
import com.codeclan.example.Filingservice.repositories.FolderRepository;
import com.codeclan.example.Filingservice.repositories.UserRepository;
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
    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        User user1 = new User("Bob Smith");
        userRepository.save(user1);
        User user2 = new User("Jimmy Robertson");
        userRepository.save(user2);

        Folder folder1 = new Folder("Pics", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Text Files", user2);

        File file1 = new File("Picture", ".jpeg", 32, folder1);
        fileRepository.save(file1);
        File file2 = new File("Words", ".txt", 16, folder2);
        fileRepository.save(file2);

        user1.addFolder(folder1);
        user2.addFolder(folder2);
        userRepository.save(user1);
        userRepository.save(user2);
        folder1.addFile(file1);
        folderRepository.save(folder1);
    }
}
