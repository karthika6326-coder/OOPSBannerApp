public class HelloAppUC5 {

    public static void main(String[] args) {

        if (args.length > 0) {
            String names = "";
            for (String name : args) {
                names += name + " ";
            }
            System.out.println("Hello, " + names.trim() + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}