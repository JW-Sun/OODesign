package com.ym.P_02_observer.Demo01;

public class Main {

    public static void main(String[] args) {
        NewsPaperSubject newsPaperSubject = new NewsPaperSubject();

        Reader reader1 = new Reader();
        reader1.setName("Jeff");

        Reader reader2 = new Reader();
        reader2.setName("Gok");

        Reader reader3 = new Reader();
        reader3.setName("Poi");

        newsPaperSubject.attach(reader1);
        newsPaperSubject.attach(reader2);
        newsPaperSubject.attach(reader3);

        newsPaperSubject.setContent("发布消息了哦");
    }

}
