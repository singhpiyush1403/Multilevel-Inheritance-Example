class Grandparent {
    void grandparentMethod() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("This is the child class.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.grandparentMethod();
        obj.parentMethod();
        obj.childMethod();
    }
}
