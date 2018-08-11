import java.util.Scanner;
public class BuscaBidimensional{
    static int[] BuscaBinariaBidimensional(int m[][], int valor){
        int fimcol = m[0].length-1;
        int inicol = 0;
        int i=0;
        for(;i<m.length;i++){
            if(m[i][fimcol]>=valor){
                break;
            }
        }
        int arr[] = new int[2];
        while(inicol <= fimcol){
            int meio = (inicol + fimcol)/2;
            if(m[i][meio] == valor){
                arr[0] = i+1;
                arr[1] = meio+1;
                return arr;
            }
            else{
                if(m[i][meio] < valor){
                    inicol = meio+1;
                }
                else{
                    if(m[i][meio] > valor){
                        fimcol = meio-1;
                    }
                }
            }
        }
        arr[0] = -1;
        arr[1] = -1;
        return arr;
    }
    public static void main(String[] args){
        System.out.println("\n-PROGRAMA QUE EXECUTA BUSCA BIDIMENSIONAL EM UMA MATRIZ PARA PROCURAR UM VALOR-");
        System.out.println("A matriz neste programa eh pre-definida, caso queira modificar, altere o codigo.");
        int m[][]= {{-55, -50, -42, -33, -30},{-30, -21, -4, 0, 0},{3, 5, 18, 33, 34},{39, 45, 59, 87, 122}};
        Scanner number = new Scanner(System.in);
        System.out.print("Digite um valor que deve ser buscado na matriz: ");
        int valor = number.nextInt();
        int a[] = BuscaBinariaBidimensional(m, valor);
        System.out.println("O valor se encontra nas posicoes: Linha "+a[0]+" e Coluna "+a[1]);
        
    }
}