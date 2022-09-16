package tp1;
public class Robot {
    Bateria bat = new Bateria();
    protected boolean status=false;

    
    public void avanzar(int steps){
        
        double energy = steps/10;
        
        if(status){
            if(bat.getCarga()>= energy){
                bat.setCarga(bat.getCarga() - energy);
                System.out.println("Me movi "+steps+" pasos");
            }else{
                System.out.println("No puedo caminar. Me falta bateria :'(");
            }
        }else{
            System.out.println("Estoy durmiendo zzz...");
        }
    }
    
    public void retroceder(int steps){
        
        double energy = steps/10;
        
        if(status){
            if(bat.getCarga()>= energy){
                bat.setCarga(bat.getCarga() - energy);
                System.out.println("Retrocedi "+steps+" pasos");
            }else{
                System.out.println("No puedo caminar. Me falta bateria :'(");
            }
        }else{
            System.out.println("Estoy durmiendo zzz...");
        }
    }
    
    public void dormir(){
        status = false;
        System.out.println("Estoy durmiendo zzz...");
    }
    
    public void despertar(){
        status = true;
        System.out.println("Estoy despierto!!! :D");
    }
    
    public void recargar(){
        bat.setCarga(1000);
    }
    
    public boolean bateriaLlena(){
        return (bat.getCarga()==1000);
    }
    
    public boolean bateriaVacia(){
        return (bat.getCarga()==0);
    }
    
    public double energiaActual(){
        return bat.getCarga();
    }
}