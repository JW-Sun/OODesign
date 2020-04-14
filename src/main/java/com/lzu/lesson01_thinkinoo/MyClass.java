package com.lzu.lesson01_thinkinoo;

public class MyClass {
    public static void main(String[] args) {

        MyClass myClass = new F().setC(3).setD(4).build();

        System.out.println(myClass);

    }


    @Override
    public String toString() {
        return "MyClass{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    private int a;
    private int b;
    private int c;
    private int d;

    public MyClass(F f) {
        this.a = f.a;
        this.b = f.b;
        this.c = f.c;
        this.d = f.d;
    }



    public F builder() {
        return new F(this);
    }


    public static class F {

        private int a;
        private int b;

        private int c;
        private int d;

        public F() {
            this.a = 1;
            this.b = 2;

        }

        public F(MyClass myClass) {
            this.a = myClass.a;
            this.b = myClass.b;
        }

        public F setC(int c) {
            this.c = c;
            return this;
        }

        public F setD(int d) {
            this.d = d;
            return this;
        }

        public MyClass build() {
            return new MyClass(this);
        }

    }

}
