package tp1;
public class Hombre {

    public void jugarConRobot(Robot robot, int avance, int retroceso){
        robot.despertar();
        robot.avanzar(avance);
        robot.retroceder(retroceso);
        System.out.println("El robot tiene "+robot.energiaActual()+" de energia");
        robot.dormir();
    }
}
