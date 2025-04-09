import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        int sum = 0;
        for(int i : L){
            sum += L.get(i - 1);
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> ans = new ArrayList<>() {};
        for(int i : L){
            if(L.get(i - 1) % 2 == 0){
                ans.add(L.get(i - 1));
            }
        }
        return ans;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> min = L1;
        List<Integer> max = L2;
        List<Integer> ans = new ArrayList<>();
        if(L1.size() > L2.size()){
            min = L2;
            max = L1;
        }
        for(int i : min){
            if(max.contains(min.get(i - 1))){
                ans.add(min.get(i - 1));
            }
        }
        return ans;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for(String word: words){
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == c){
                    count++;
                }
            }
        }
        return count;
    }
}
