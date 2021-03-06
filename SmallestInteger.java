import java.util.Arrays;

/*
Write a function that, given an array A of N integers, returns the smallest positive integer (greater than 0) 
that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/

import java.util.Arrays;

class SmallestInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A); //sort the array 1,1,2,3,4,6
        
        int count = 1; 
         
        for(int i=0; i<A.length; i++){ 
         if(A[i] == count){
              count++; 
          }      
        }   
    return count; 
    }
}
