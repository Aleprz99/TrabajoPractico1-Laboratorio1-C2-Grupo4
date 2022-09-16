
package tp1;

public class TestJuego {

    public static void main(String[] args) {
        Hombre h1 = new Hombre();
        Hombre h2 = new Hombre();
        Robot rbt = new Robot();
        
        rbt.recargar();
        h1.jugarConRobot(rbt);
        h2.jugarConRobot(rbt);
    }
}
