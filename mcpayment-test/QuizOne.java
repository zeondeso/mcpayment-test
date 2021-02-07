/******************************************************************************
Question :
We have array of integers called nums, write a function to return all numbers (in a form
of array of integers) that when subtracted by any of integers in nums doesn't return
number that is < 0
for example : nums = [3,1,4,2], your output should be : [4], because when 4 is subtracted
by 3 or 1 or 4 or 2 doesn't return number that is < 0

*******************************************************************************/


import java.util.*;

public class QuizOne
{
    
    public static Integer[] result(Integer[] nums){
        List<Integer> listResult = new ArrayList<>();
        
        for(int i : nums){
            
            boolean moreThanZero = true;
            
            for(int j : nums){
                int x = i - j;
                if(x < 0) moreThanZero = false;
            }
            
            if(moreThanZero){
                listResult.add(i);
            }
        }
       
        return listResult.stream().toArray(Integer[]::new);
        
    }
    
	public static void main(String[] args) {
		
		Integer[] input = {7,5,4,2};
		
		System.out.println(Arrays.toString(result(input)));
		
	}
}