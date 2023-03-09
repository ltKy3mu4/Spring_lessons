package ru.mpei.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ru.mpei.demo.service.FileService;

@RestController
public class FileController {
    @Autowired
    private FileService fileService;

    @PostMapping("/data/upload")
    public void uploadFile(@RequestParam MultipartFile file){
        fileService.parseFile(file);

    }
}
