public class Mi_Archivo {

    public class HolaMundo {

     public static void main(String[] args) {
        System.out.println("Hola, mundo desde Java!");
        saludar("Cristopher");
        sumar(5, 3);
     }

     public static void saludar(String Nombre ){
        System.out.println(" Hola " + Nombre+ "¡Bienvenida al ejercicio de Git y Github!");
     }

     public static void sumar(int a,int b){
        int resultado= a+b;
        System.out.println("La suma de " +a+ "+" +b+ " es: "+resultado);
     }
        
    }
    
}
