public class IntercambioValores {

    public static void main(String[] args) {
       
    int a = 5;
    int b = 10;

    System.out.println("antes del intercambio");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    intercambiar(a, b);

    System.out.println("despues del intercambio");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    
    }
    
    public static void intercambiar (int x, int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println( "dentro del metodo");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
}
