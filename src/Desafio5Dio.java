//import java.io.IOException;
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Desafio5Dio {
//	
//    public static void main(String[] args) throws IOException {
//    	
//		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
//		
//		System.out.print("Digite um numero: ");
//		double X = leitor.nextDouble();
//		
//		System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
//    }
//	
//}

//import java.util.Locale;
//import java.util.Scanner; 
//
//public class Desafio5Dio{
//	public static void main(String[] args){
//		
//		try (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) {
//			double area;
//			double pi = 3.14159;
//			double raio = scan.nextDouble();
//
//			area = pi * (Math.pow(raio,2));
//
//			System.out.println(String.format("A=%.4f", area));
//		}
//	}
//
//}



