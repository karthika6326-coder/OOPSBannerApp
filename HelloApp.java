public class UC7 {
    public static void main(String[] args) {
        String message;

        if (args.length > 0) {
            message = String.join(" ", args);
        } else {
            message = "Default Message";
        }

        System.out.println("Hello " + message);
    }
}