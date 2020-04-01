package com.example.filingsystem.filingservice;

import com.example.filingsystem.filingservice.models.File;
import com.example.filingsystem.filingservice.repositories.FileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilingserviceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void createFile(){
//		File file = new File("Secret File", "secret", 520);
//		fileRepository.save(file);
//
//
//
//	}





}
