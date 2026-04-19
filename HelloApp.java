public class UC6 {
    public static void main(String[] args) {
        String message;

        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (String arg : args) {
                sb.append(arg).append(" ");
            }

            message = sb.toString().substring(0, sb.length() - 1);
        } else {
            message = "Default Message";
        }

        System.out.println("Hello " + message);
    }
}