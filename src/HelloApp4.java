public class HelloApp {

    public static void main(String[] args) {

        String result;

        // Check if arguments are provided
        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            result = nameBuilder.toString();
        }

        // Final output
        System.out.println("Hello, " + result + "!");
    }
}