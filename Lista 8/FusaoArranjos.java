class FusaoArranjos{
    public static void main(String[]args){
        int a[]=new int[(int)(Math.random()*10];
        int b[]=new int[(int)(Math.random()*10];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*10);
        }
        for(int i=0;i<b.length;i++){
            b[i]=(int)(Math.random()*10);
        }
        a=ordena(a);
        for(int v:a){
            System.out.print(v+" ");
        }
        System.out.println();
        b=ordena(b);
        for(int v:b){
            System.out.print(v+" ");
        }
        System.out.println();

        int []f=soma(a,b);
        f=ordena(f);
        for(int v:f){
            System.out.print(v+" ");
        }

    }
    static int[] ordena(int a[]){
        for(int ult=a.length-1;ult>0;ult--){
            for(int i=0;i<ult;i++){
                if(a[i]>a[i+1]){
                    int aux=a[i];
                    a[i]=a[i+1];
                    a[i+1]=aux;
                }
            }
        }
        return a;
    }
    static int[] soma(int[]a,int[]b){
        int t=a.length+b.length;
        int[]f=new int[t];
        for(int i=0;i<f.length;i++){
            if(i<a.length) f[i]=a[i];
            else if(i>=a.length){
                int j=0;
                f[i]=b[j];
                j++;
            }
        }
        return f;
    }
}