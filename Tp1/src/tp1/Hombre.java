package tp1;
public class Hombre {

    public void jugarConRobot(Robot robot){
        robot.despertar();
        robot.avanzar(500);
        robot.retroceder(20);
        System.out.println("El robot tiene "+robot.energiaActual()+" de energia");
        robot.dormir();
    }
}
