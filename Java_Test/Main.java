class Main {
    private String name;
    public static void main(String... args) {

        String ind = args[0];

        System.out.println("1235asd2356".matches("^.*" + ind + ".*$"));
    }

}

class A {

    private static int high; // Class member
    private int weight; // Instance member

    {
        System.out.println("1. Instance Init Area");
    }

    static {
       System.out.println("2. Class Init Area");
    }

    A () {
        System.out.println("3. Constructor");
    }

    void method1() {
        System.out.println("4. Instance Method");
    }
}



