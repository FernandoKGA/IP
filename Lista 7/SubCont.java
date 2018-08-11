import java.util.Scanner;
class SubCont{
    static void subcont(String s){
        char[] s1 = s.toCharArray();
        int i=0;
        for(char k:s1){
            if(k == ' '){
                i++;
            }
        }
        int ct = 0;
        Scanner scan = new Scanner(s);
        while(ct<=i){
            String str = scan.next();
            System.out.println(str);
            ct++;
        }
    }
    public static void main(String[] args){
        String s = "as12; bbcdd --- 987 .:.:. @Alf@#";
        subcont(s);
    }
}