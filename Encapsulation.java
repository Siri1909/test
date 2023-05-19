class A {
    private int value;

    public int setValue(int x) {
        return value = x;
    }

    public int getValue() {
        return value;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        A r = new A();
        r.setValue(100);
        System.out.print(r.getValue());
    }
}