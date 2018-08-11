package p1;
public class ExecutarPessoas{
    public static void main(String[] args){
        Pessoa p1;
        Pessoa p2;
        Aluno a1;
        Aluno a2;
        p1 = new Pessoa();
        a1 = new Aluno();
        System.out.println("Contador A1: "+a1.contador);
        System.out.println("Contador Pessoa: "+Pessoa.contador);
    }
}