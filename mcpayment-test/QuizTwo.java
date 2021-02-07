/******************************************************************************
Question :
We have array of integers called nums and an integer called x, write a function to return
all numbers (in a form of array of integers) that when divided by any of integers in nums
doesn't return x
for example : nums = [1,2,3,4], x = 4, your output should be : [1,2,3], because only 4
divided by 1 is 4 (x)

*******************************************************************************/


import java.util.*;

public class QuizTwo
{
    
    public static Integer[] result(Integer[] nums, int x){
        List<Integer> listResult = new ArrayList<>();
        
        for(int i : nums){
            
            boolean sameAsX = false;
            
            for(int j : nums){
                if((i/j) == x) sameAsX = true;
            }
            
            if(!sameAsX){
                listResult.add(i);
            }
        }
       
        return listResult.stream().toArray(Integer[]::new);
        
    }
    
	public static void main(String[] args) {
		
		Integer[] input = {1,2,3,4};
		
		int x = 4;
		
		System.out.println(Arrays.toString(result(input, x)));
		
	}
}