package multipletryblock;

public class MultipleCatchBlock {

    public static String message(int[] numbers , int index){
        try{
            System.out.println(numbers[index]);
        } catch (NullPointerException e){
            return "Array is not initialized!" + e.getMessage();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return "Invalid index";
        }
        int val = numbers[index];
        return "";
    }
    public static void main(String[] args) {

        int[] numbers = new int[3];
        int index = 1;
        System.out.println(message(numbers,index));
    }
}
