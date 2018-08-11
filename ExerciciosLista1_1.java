class ExerciciosLista1_1{
    public static void main(String[] args){
        int a = 3; //aloca e define uma variável
        int b = 5; // "
        int c = 8; // "
        int d = a * (b + c * 3) - 7; //variável é definida e faz uma expressão matemática
        int e = a - b - c; // "
        System.out.println(a+" "+b+" "+c+" "+d+" "+e); // valores são demonstrados ao usuário
        a = a + 1; // variável toma outro valor
        b = (4 * a + 1) / 10; // "
        c = (4 * a + 1) % 10; // "
        System.out.println(a+" "+b+" "+c+" "+d+" "+e); // valores são demonstrados ao usuário com variáveis modificadas
    }
}