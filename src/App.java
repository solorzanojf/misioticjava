import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        Scanner ingresar=new Scanner(System.in);
        String nombre = ingresar.nextLine();
        System.out.println("su nombre es "+nombre);
        ingresar.close();
        
    }
}
