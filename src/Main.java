public class Main {
    public static int add (int a,int b) {
        return (a+b);
    }
    public static String greeting (String name)  {
        return ("Bonjour, " + name + "!");
    }
    public static int add (int a, int b, int c, int d) {
        return (add(d, add(c, add(a, b))));
    }
    public static String printMe (String toBePrinted){
        return (toBePrinted);
        }

    public static void main(String[] args) {
    int resultOne = add(5, 67);
        System.out.println(resultOne);
    String resultTwo = (greeting("Mr Ewing I'm unsure if you want general or specific"));
        System.out.println(resultTwo);
    int resultThree = add(2,3,4,6);
        System.out.println(resultThree);
        System.out.println(printMe("I hope this works"));










    }

}
