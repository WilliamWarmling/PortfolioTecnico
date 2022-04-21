import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner pegasus = new Scanner(System.in);
	System.out.println("Digite um número");
    double n = pegasus.nextInt();
    double i = 0;
    while(i <= n ){
        //if(i % 2 == 0){
        System.out.println(i);
        i = i+ (0.00001);
    }
    
    }
	}
