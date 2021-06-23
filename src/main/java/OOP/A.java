package OOP;

/* Create Class A with a constructor that accepts 2 parameters and saves them to variables.
  ( A(String name, int age) ). Create class B that extends class A and has constructor with no parameters.
   (B()) - make code to compile successfully. Print instance of B.
*/
public class A {

    public String name;
    public int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + age);
    }

    public A() {

    }

    public class B extends A {
        public B(String name, int age) {
            super(name, age);
        }

        public B() {
            super();
        }

        public void main(String[] args) {
            B obj1 = new B();
            A obj = new A("Marta", 25);
            System.out.println(obj1.name + obj1.age);

        }
    }
}













