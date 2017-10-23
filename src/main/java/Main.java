public class Main {

    public static void main(String[] args) {

        // Get input from command line
        int input = 0;

        if (args.length == 0 || args.length > 1) {
            System.out.println("Invalid arguments!");
            System.exit(1);
        } else {
            try {
                input = Integer.parseInt(args[1]);
            } catch (Exception e) {
                System.out.println("Invalid arguments!");
                System.exit(1);
            }
        }


        int lc = LazyCaterer(input);
        int tri = TriangleNumber(input);

        System.out.println("Tri("+input+") = " + tri);
        System.out.println("Lazy("+input+") = " + lc);


    }

    public static int LazyCaterer(int num) {

        if (num < 0) {
            return 1;
        } else {
            return ((num*num) + num + 2)/2;
        }
    }

    public static int TriangleNumber(int num) {

        if (num < 0) {
            return 0;
        } else {
            int result = 0;
            for (int i = num; i > 0; i--) {
                result += i;
            }

            return result;

        }
    }

}
