package com.walking.l20t01;

public class FileService {
    private File[] files;

    FileService(File[] file) {
        this.files = file;
    }

    public String searchFile(String filename) throws Exception {
        for (File curFile : files) {
            if (curFile.getFileName().equals(filename)) return curFile.toString();
        }
        throw new Exception("FileNotFoundException");
    }


}
