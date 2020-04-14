package com.lzu.lesson05_Decorator.FileInputStream;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new SimulateIO(new BufferedInputStream(new FileInputStream("E:\\JavaIDEAProject\\OODesign\\src\\main\\java\\com\\lzu\\lesson05_Decorator\\FileInputStream\\text1")));
        int c = 0;
        while ((c = inputStream.read()) >= 0) {
            System.out.print((char)c);
        }
        inputStream.close();
    }
}
