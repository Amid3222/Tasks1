package com.walking.l20t01;

import java.util.Scanner;



public class Main {
    static String searchFile() {
        System.out.println("Введите название файла в формате Имя.РАСШИРЕНИЕ: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static File[] initFileList() {
        File file1 = new File("porn video", FileTypes.MP4);
        File file2 = new File("Курсач финал6(преподша шалава дырявая)", FileTypes.TXT);
        File file3 = new File("my song", FileTypes.WAV);
        File file4 = new File("dick pic", FileTypes.PNG);

        return new File[]{file1, file2, file3, file4};
    }

    public static void main(String[] args) throws Exception {
        FileService fileService = new FileService(initFileList());
        System.out.println(fileService.searchFile(searchFile()));

    }
}
