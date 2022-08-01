package javaFsdProjects;

public class LongestSubsequence {
	
		   static int IncreasingSubsequence(int my_arr[], int len_arr)
		   {
		      int sequence_arr[] = new int[len_arr];
		      int x, y, max = 0;
		      for (x = 0; x < len_arr; x++)
		         sequence_arr[x] = 1;
		      for (x = 1; x <len_arr; x++)
		      for (y = 0; y < x; y++)
		      {
		      if (my_arr[x] > my_arr[y] && sequence_arr[x] < sequence_arr[y] + 1)
		      sequence_arr[x] = sequence_arr[y] + 1;
		      }
		      for (x = 0; x < len_arr; x++)
		      {
		      if (max < sequence_arr[x])
		      max = sequence_arr[x];
		      }
		      return max;
		   }
		   public static void main(String args[]){
		      int my_arr[] = { 10,22,9,33,21,38,50,41,60,53,69};
		      int len_arr = my_arr.length;
		      System.out.println("Length of the longest increasing subsequence = " +  IncreasingSubsequence(my_arr, len_arr));
		   }
	}


	
