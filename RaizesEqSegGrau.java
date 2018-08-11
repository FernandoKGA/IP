class RaizesEqSegGrau{
    public static void main(String[] args){
        //ax^2 + bx + c
        double delta, a, b, c, x1, x2;
        a = 2;
        b = 8;
        c = 4;
        delta = Math.pow(b,2) - (4 * a * c);
        x1 = (-(b) + delta)/2.0*a;
        x2 = (-(b) - delta)/2.0*a;
        System.out.println("As raízes da equação são: "+x1+" e "+x2);
    }
}