//TAKE AN ARRAY AS INPUT FROM THE USER. SEARCH FOR A GIVEN NUMBER AND PRINT INDEX AT ITS OCCURS.
// this is also called linear search algoritm of Array.
import java.util.*;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter elements of array: ");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        //now its time to code
        System.out.println("Enter a number that you want to search ");
        int num = sc.nextInt();
        for(int i=0;i<size;i++){
            if(num==numbers[i]){
                System.out.println("Number is found at index "+i);
                break;

        

        }



    }
    
}}
