import java.util.Scanner;
public class AdivinhaNumero{
    static void adivinha(int n){
        int[] arr = new int[n+1];
        int f = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = f;
            f++;
        }
        int fim = arr.length - 1;
        int ini = 0;
        String s1 = "menor";
        String s2 = "igual";
        String s3 = "maior";
        Scanner mim = new Scanner(System.in);
        while(fim != ini){
            int meio = (fim+ini)/2;
            System.out.println("Valor: "+arr[meio]);
            System.out.print("Valor eh menor, igual ou maior? ");
            String r = mim.nextLine();
            if(r.equals(s1)){
                fim = meio-1;
            }
            else{
                if(r.equals(s2)){
                    System.out.println("O valor eh: "+arr[meio]);
                    System.exit(0);
                }
                else{
                    if(r.equals(s3)){
                        ini = meio+1;
                    }
                    else{
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("--PROGRAMA QUE ADIVINHA VALOR COM BASE EM BUSCA BINÁRIA--\n");
        System.out.print("Digite um tamanho máximo de número que o programa deve adivinhar\nInsira: ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        adivinha(n);
        number.close();
    }
}