package languagebasics.operators;

class InstanceofDemo {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instance of Parent: "
            + (obj1 instanceof Parent));
        System.out.println("obj1 instance of Child: "
            + (obj1 instanceof Child));
        System.out.println("obj1 instance of MyInterface: "
            + (obj1 instanceof MyInterface));
        System.out.println("obj2 instance of Parent: "
            + (obj2 instanceof Parent));
        System.out.println("obj2 instance of Child: "
            + (obj2 instanceof Child));
        System.out.println("obj2 instance of MyInterface: "
            + (obj2 instanceof MyInterface));
    }
    
}
class Parent{}
class Child extends Parent implements MyInterface{}
interface MyInterface{}