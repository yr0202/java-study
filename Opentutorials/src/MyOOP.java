public class MyOOP {
    public static String delimiter = "";
    public static void main(String[] args) {
        delimiter = "----";
        printA();
        printA();
        printA();

        delimiter= "*****";
        printB();
        printB();
        printB();
    }
    public static void printA(){
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public static void printB(){
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
