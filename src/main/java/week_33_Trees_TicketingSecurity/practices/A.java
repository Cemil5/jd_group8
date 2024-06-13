package week_33_Trees_TicketingSecurity.practices;

class A {
    {
        System.out.println("1");
    }
}

class B extends A {
    static {
        System.out.println("2");
    }
}

class C extends B {
    {
        System.out.println("3");
    }
}

class MainClass{
    public static void main(String[] args) {
        C c = new C();
    }
}