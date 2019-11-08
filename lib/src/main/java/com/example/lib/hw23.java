package com.example.lib;

import java.io.FileReader;
import java.io.IOException;
public class hw23 {
    public static void main(String[] args) {

        FileReader fr = null;
        try {
            fr = new FileReader("D:\\3A513017.txt");
            char[] buf = new char[1024];
            int len = 0;
            while ((len = fr.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
        } catch (IOException e) {
            System.out.println("read-Exception :" + e.toString());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("close-Exception :" + e.toString());
                }
            }
        }
    }
}
