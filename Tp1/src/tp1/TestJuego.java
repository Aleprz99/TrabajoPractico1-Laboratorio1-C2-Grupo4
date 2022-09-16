
package tp1;

public class TestJuego {

    public static void main(String[] args) {
        Hombre h1 = new Hombre();
        Hombre h2 = new Hombre();
        Robot rbt = new Robot();
        
        rbt.recargar();
        System.out.println("-----Primer hombre----");
        h1.jugarConRobot(rbt, 500, 20);
        
        System.out.println("--Segundo Hombre---");
        h2.jugarConRobot(rbt, 300, 200);
    }
}
