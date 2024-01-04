package _07_recursion;

public class DuplicateString {
    /* public static void DupStr(String str, int inx, StringBuilder  newStr, boolean map[]){
         if (inx==str.length()){
             System.out.println(newStr);
             return ;
         }
         char cuurntChar = str.charAt(inx);
         if (map[cuurntChar-'a']==true){
             DupStr(str, inx+1, newStr, map);
         }
         else {
             map[cuurntChar-'a']=true;
             DupStr(str,inx+1, newStr.append(cuurntChar), map);
         }

     }*/
    public  static  void  dup (int ind,String str, StringBuilder newstr, boolean arr[]){
        if(ind==str.length()){
            System.out.println(newstr);
            return;
        }
        char currnetinde = str.charAt(ind);
        if(arr[currnetinde-'a'] ==true){
            dup(ind+1, str, newstr,arr);
        }
        else {
            dup(ind+1, str, newstr.append(currnetinde),arr);
        }
    }
    public static void main(String[] args) {
        String str = "rohitjdhav";
//        DupStr(str, 0,new StringBuilder(""), new boolean[26] );
        dup(0, str, new StringBuilder(""), new boolean[26]);

    }
}
