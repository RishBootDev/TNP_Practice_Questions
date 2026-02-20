package CodingBatProblems;

public class Outer {

    // this is a important concept of the member inner class
    void display() {
        class Temp{
            void show(){
                System.out.println("this is a class inside a method");
            }
        }

        Temp temp = new Temp();
        temp.show();
    }

    class Inner{
        public void show(){
            System.out.println("hello");
        }
    }

    public void test() {
        Outer.Inner inner= new Inner();
        inner.show();
    }

    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.test();

//        Outer.Inner inner = new Outer().new Inner();
//        inner.show();

        Outer outer = new Outer();
        outer.display();

    }
}

class James{

    String name = "james";

    class Inner{
        String name = "peter";
        void show() {
            System.out.println(James.this.name);
            System.out.println(this.name);
        }
    }

    public static void main(String[] args) {
        James.Inner inner = new James().new Inner();
        inner.show();
    }
}

class First{

    static class Second{
        void show(){
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {
        First.Second second = new First.Second();
        second.show();
    }
}
