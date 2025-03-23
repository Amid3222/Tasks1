package com.walking.l20t01;

public class File {
    private String fileName;
    private int size;

    File(String fileName, FileTypes fileTypes) {
        this.fileName = fileName + "." + fileTypes;
        this.size = 500;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return """
                Имя файла: %s
                Размер: %d mb
                """.formatted(fileName, size);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof File castedFile)) return false;
        return castedFile.fileName.equals(this.fileName);
    }
}
