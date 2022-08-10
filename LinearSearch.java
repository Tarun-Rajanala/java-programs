package javaFsdProjects;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int searchValue = sc.nextInt();
        int result = (int) linear(arr,searchValue);

            if(result==-1)
            {
            	System.out.println("Element not found");
            } 
            else 
            {

                System.out.println("Element found at index "+result+" and the element is "+arr[result]);
            }
    }

public static int linear(int arr[], int x) 
{
	int arrlength = arr.length;
    for (int i = 0; i < arrlength - 1; i++) 
    {
    	if (arr[i] == x) 
    	{
    		return i;
    		}
     }

            return -1;
	}
}
