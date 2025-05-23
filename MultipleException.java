package LAB10;

public class MultipleException {
    public static void main(String[] args) {
        int[] array = {23, 45, 67, 89, 2};
        
        try {
           
            System.out.println("The value at index 10 is: " + array[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught:\n " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("It catch if exceeption if the Array is null:\n " + e);
        }
        catch (Exception e) {
           
            System.out.println("It can give us unexpected error:\n" + e);
        }
        finally {
           
            System.out.println("This is final class.It run must if exception throw or not throw.");
        }
    }
}
