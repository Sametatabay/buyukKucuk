import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a,b,c;
    Scanner inp =new Scanner(System.in);

    System.out.print("First Number Input :");
    a=inp.nextInt();

    System.out.print("Second Number Input :");
    b=inp.nextInt();

    System.out.print("Thrid Number Input :");
    c=inp.nextInt();

    if ((a>b) && (a>c)){
        if (b>c) {
            System.out.println("a>b>c");
            }else{
            System.out.println("a>c>b");
        }
    }else if((b>a) &&(b>c)){
        if (a>c){
            System.out.println("b>a>c");
        }else{
            System.out.println("b>c>a");
        }
    }else if ((c>a) && (c>b)){
        if (b>a){
            System.out.println("c>b>a");
        }else{
            System.out.println("c>a>b");
        }
    }



    }
}
