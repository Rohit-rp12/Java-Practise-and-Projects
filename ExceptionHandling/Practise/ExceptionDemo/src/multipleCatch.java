import java.util.*;
public class multipleCatch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        try{
            arr[6] = 10/0;
        }
        
        // catch(ArithmeticException e){       
        //     System.out.println(e.getMessage());
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e.getMessage());
        // }

        //can combine above 2 catch statements as
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
            {       
                System.out.println(e.getMessage());
            }
        }
    
}
