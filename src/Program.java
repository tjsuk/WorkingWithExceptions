public class Program {
    public static void main(String[] args) {
        String invalidNumber = "a";

        try{
            int number = Integer.parseInt(invalidNumber);
            System.out.println("You number is " + number);
        }
        catch(NumberFormatException e){
            System.out.println("You number is not a number");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Execution of the finally block");
        }

        System.out.println("This will still be called!");
    }


}
