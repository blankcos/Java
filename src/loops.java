public class loops {
    public static void main(String[] args) {
        pascal();
    }
    static void righttri(){
        int a=1,b=1;
        while (a!=6){
            while(b!=a+1){
                System.out.print(b);
                b++;
            }
            System.out.println();
            a++;
            b=1;
        }
    }
    static void invrig(){
        int a=5,b=1;
        while (a!=0){
            while (b!=a+1){
                System.out.print(b);
                b++;
            }
            b=1;
            System.out.println();
            a--;
        }
    }
    static void fivrto1revtri(){
        int a=1,b=5;
        while(a!=6){
            while(b!=0){
                System.out.print(b);
                b--;
            }
            System.out.println();
        }

    }
    static void pascal(){
        int i=1,n=6,j=1;

        while (i!=n){
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            while(j!=i+1) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
