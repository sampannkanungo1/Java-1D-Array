import java.util.*;
public class checksorted {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Size
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        System.out.println("Enter the element");
        for(int i = 0; i< size;i++){
            numbers[i]=sc.nextInt();

        }
        //check sorted or unsorted
        boolean isAscending = true;
        for(int i =0;i<size;i++){
            if(numbers[i] > numbers[i+1]){
                isAscending=false;

            }
        }

        //printing
        if(isAscending){
            System.out.println("THE ARRAY IS SORTED");
        }
        else{
            System.out.println("THE ARRAY IS UNSORTED");
        }
        }

    }

