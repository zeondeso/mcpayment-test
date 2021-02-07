/******************************************************************************
Question :
We have a string called word and an integer called x, write a function to return an array
of strings containing all strings that has length x.
for example : word = "souvenir loud four lost", x = 4, your output should be ["loud", "four",
"lost"] because those strings has length of 4

*******************************************************************************/

import java.util.*;

public class QuizThree
{
    public static String[] result(String words, int x){
        List<String> listResult = new ArrayList<>();
        
        String[] arrWords = words.split(" ");
        
        for(String w : arrWords){
            
            if(w.length() == x){
                listResult.add(w);
            }
        }
       
        return listResult.stream().toArray(String[]::new);
        
    }
    
	public static void main(String[] args) {
		
		String words = "souvenir loud four lost";
		
		int x = 4;
		
		System.out.println(Arrays.toString(result(words, x)));
		
	}
}