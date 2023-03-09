package ru.mpei.demo.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.StandardCharsets;

@Service
@Slf4j
public class FileServiceImpl implements FileService {
    @Override
    @SneakyThrows
    public void parseFile(MultipartFile file) {
        InputStream inputStream = file.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        String line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        while (line != null){
            String[] stringParts = line.split(",");
            if (stringParts.length > 3){
                String time = stringParts[0];
                String ia = stringParts[1];
                String ib = stringParts[2];
                String ic = stringParts[3];
                log.info("Time = {} , ia ={}, ib ={}, ic={}", time, ia,ib,ic);
            }

            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        log.info("FIle read successfully");
    }
}
