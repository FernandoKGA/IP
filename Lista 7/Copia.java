import java.util.Scanner;
class Copia{
    static void copia(String s){
        char[] s2 = s.toCharArray();
        char[] s3 = new char[s.length()];
        for(int i=0;i<(s.length());i++){
            s3[i] = s2[i];
        }
        String s1 = new String(s3);
        System.out.println(s1);
    }
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String s = entry.nextLine();
        copia(s);
    }
}