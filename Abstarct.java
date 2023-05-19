abstract class A {
    A() {
        System.out.println("hi");
    }

    public abstract void wish();
}

class B extends A {
    B() {
        super();
    }

    public void wish() {
        System.out.println("helo");
    }
}

class C extends A {
    C() {
        super();
    }

    public void wish() {
        System.out.println("halo");
    }
}

class Abstarct {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        b.wish();
        c.wish();
    }
}
