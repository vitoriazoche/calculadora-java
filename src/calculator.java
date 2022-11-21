import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha sua operação");
        System.out.println("1 para somar");
        System.out.println("2 para subtrair");
        System.out.println("3 para dividir");
        System.out.println("4 para multiplicar");

        int choose = scan.nextInt();

        System.out.println("digite dois números!");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(choose == 1){
            System.out.println("a resposta é:"+ add(x,y));
        }else if (choose == 2){
            System.out.println("a resposta é:"+ sub(x,y));
        }else if (choose == 3){
            System.out.println("a resposta é:"+ mul(x,y));
        }else if(choose == 4){
            System.out.println("a resposta é:"+ div(x,y));
        }else{
            System.out.println("você está fora!");
        }
    }
    public static int add(int x, int y){
        int n;
        n = x+y;
        return n;
    }
    public static int sub(int x, int y){
        int n;
        n = x-y;
        return n;
    }
    public static int mul(int x, int y){
        int n;
        n = x*y;
        return n;
    }
    public static int div(int x, int y){
        int n;
        n = x/y;
        return n;
    }
}
