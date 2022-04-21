import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner pegasus = new Scanner(System.in);
		System.out.println("Digite para qual variavel calcular");
		System.out.println("1 para An, 2 para A1, 3 para R, 4 para n");
	    int resposta = pegasus.nextInt();
	    if(resposta ==1){
	       System.out.println("Digite o valor de a1:"); 
	        double a1 = pegasus.nextDouble();
	        System.out.println("Digite o valor de r:"); 
	        double r = pegasus.nextDouble();
	        System.out.println("Digite o valor de n:"); 
	        double n = pegasus.nextDouble();
	        double an = a1 + (n-1) *r;
	        System.out.println("resultado de An :"+an);
	    }
	  
	    else if(resposta == 2){
	         System.out.println("Digite o valor de An:"); 
	        double an = pegasus.nextDouble();
	        System.out.println("Digite o valor de R:"); 
	        double r = pegasus.nextDouble();
	        System.out.println("Digite o valor de n:"); 
	        double n = pegasus.nextDouble();
	        double a1 = an - (n-1) *r;
	        System.out.println("resultado de A1 :"+a1);
	    }
	   	    else if(resposta == 3){
	         System.out.println("Digite o valor de an:"); 
	        double an = pegasus.nextDouble();
	        System.out.println("Digite o valor de a1:"); 
	        double a1 = pegasus.nextDouble();
	        System.out.println("Digite o valor de n:"); 
	        double n = pegasus.nextDouble();
	        double r = (an - a1)/(n - 1);
	        System.out.println("resultado de r :"+r);
	   	    }
	   	    
	        else if(resposta == 4){
	         System.out.println("Digite o valor de an:"); 
	        double an = pegasus.nextDouble();
	        System.out.println("Digite o valor de a1:"); 
	        double a1 = pegasus.nextDouble();
	        System.out.println("Digite o valor de r:"); 
	        double r = pegasus.nextDouble();
	        double n = ((an - a1)/r)+1; 
	        System.out.println("resultado de n :"+n);
	        
	    }
	    
	    
		//a1 = an - (n-1) *r;    
		//System.out.println(a1);
		//r = (an - a1)/(n - 1);
		//System.out.println(r);
		//r = (an - a1)/(n - 1)
		//(n-1) = (an - a1)/r
		//n = ((an - a1)/r)+1
		//n = ((an - a1)/r)+1;
		//System.out.println(n);

}
	}
