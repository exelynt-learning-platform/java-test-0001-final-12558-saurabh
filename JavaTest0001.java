public class JavaTest0001 {
    public static void main(String[] args) {

        int number = 5;

        for (int i = 1; i <= number; i++) {

            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = number - 1; i >= 1; i--) {

            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}