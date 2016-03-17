public class A extends B {
    A() {
        System.out.println("1: A konstruktor");
    }
    static {
        System.out.println("2: A static");
    }
    {
        System.out.println("3: A {}");
    }
    public static void main(String[] args){
        A a = new A();
    }
}

class B extends C {
    B(){
        System.out.println("4: B konstruktor");
    }
    {
        System.out.println("5: B {}");
    }
    {
        System.out.println("6: B {}");
    }
}

class C {
    C(){
        System.out.println("7: C konstruktor");
    }
    static {
        System.out.println("8: C static");
    }
    {
        System.out.println("9: C {}");
    }
}