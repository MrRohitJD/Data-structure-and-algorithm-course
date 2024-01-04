package _19_Tries;
import static _19_Tries._01_Insert_element_in_Tries.*;

public class _02_word_break_prob {
    public static boolean wbp(String key){
        if (key.length()==0){
            return true;
        }
        for (int i = 1; i <=key.length() ; i++) { // in substring last value is exclusive
            if (search(key.substring(0, i)) &&
                        wbp(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word[]={"i","like","samsung", "mobile","ice"};
        for (int i = 0; i < word.length ; i++) {
            insert(word[i]);
        }
        String key ="ilike";
        System.out.println(wbp(key));
    }
}
