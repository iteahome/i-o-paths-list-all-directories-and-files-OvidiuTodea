package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //List all files and directories from a specific path.

    public static void main(String[] args) throws IOException {

        Path givenPath = Paths.get("D:\\ITeaHome");
        List<Path> allDirAndFiles = Files.list(givenPath).collect(Collectors.toList());

        System.out.println(" Content of path: " + givenPath);
        for(Path p : allDirAndFiles){
            System.out.println(p.getFileName() + ", ");
        }
    }
}
