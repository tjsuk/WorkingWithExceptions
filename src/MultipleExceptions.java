public class MultipleExceptions {
    public static void main(String[] args) {
        String[] numbers = {"10","20","abc",null,"50"};

        for (String number : numbers) {
               int result = Integer.parseInt(number);
               System.out.println("The number is " + result);
        }
    }
}
