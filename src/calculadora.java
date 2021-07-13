import java.util.Scanner;

public class Calculadora {
    public static void main(String args []) throws Exception {
        System.out.println("PARA SUMA MARQUE 1");
        System.out.println("PARA RESTA MARQUE 2");
        System.out.println("PARA MULTIPLICACION MARQUE 3");
        System.out.println("PARA SUMA DIVICION 4");
        Scanner scanner = new Scanner(System.in);
        int operacion= scanner.nextInt();
        if (operacion<4 && operacion>0){
            System.out.println("INGRESE EL PRIMER NUMERO ENTERO");
            int numero1= scanner.nextInt();
            System.out.println("INGRESE EL SEGUNDO NUMERO ENTERO");
            int numero2= scanner.nextInt();
            int resultado= 0;
        
            switch (operacion){
                case 1:
                    resultado = numero1+numero2;
                    break;
                case 2:
                    resultado = numero1-numero2;
                    break;
                case 3:
                    resultado = numero1*numero2;
                    break;
                case 4:
                    resultado = numero1/numero2;
                    break;
                /*default:
                    System.out.println("el tipo de operacion no es valido");*/
            }
            System.out.println(resultado);
        }
        System.out.println("el tipo de operacion no es valido");   
    }
           
}