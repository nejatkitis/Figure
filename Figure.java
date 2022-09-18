import java.util.Scanner;

public class Figure {
    static void fig(int a){
        int i = 1;
        while (a>0){
            System.out.print(a+",");
            a -= 5;
            i++;
        }
        for (int j=i;j>0;j--){
            System.out.print(a+",");
            a +=5;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = in.nextInt();
        fig(a);
    }
}
