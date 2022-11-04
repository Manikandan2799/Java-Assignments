package JavaPractices;

class Singleton {
    static Singleton object = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (object == null)
            object = new Singleton ( );
        return object;
    }

    void Check() {
        System.out.println ("Singleton Class Demo is Working...");
    }

    void Check1() {
        System.out.println ("Singleton Class Demo is Also Working...");
    }


    public static class SingletonDemo {
        public static void main(String[] args) {
            Singleton Demo = Singleton.getInstance ( );
            Demo.Check ( );
            Demo.Check1 ( );
        }
    }
}
