
import edu.epromero.util.LienzoStd;
import java.awt.Color;
import edu.epromero.util.Imagen;



public class Pong {


    public static void main(String[] args) throws InterruptedException {
//        LienzoStd.ponEscala(0, 100);
//        Pelota bulebule = new Pelota();
//        Pelota bule = new Pelota(20, 20,Color.GREEN, 5);
//        //Pelota bule = new Pelota(veloX,veloY);
//        int i;
//        for (i=0; i<=500 ; i++){
//            LienzoStd.limpia();
//            bulebule.Pinta();
//            bule.Pinta();
//            LienzoStd.mostrar(0);
//            Thread.sleep(30);
//            bulebule.Mover();
//            bule.Mover();
//            
//            
//        }
        
        LienzoStd.ponEscala(0, 512);
        
        Imagen img = new Imagen("pelota.jpg");
        
        Pelota bulebule[] = new Pelota[1];
        RaquetaIA Wilson = new RaquetaIA();
        RaquetaHumana Losser = new RaquetaHumana();
        
        int i, j;
        for ( i=0 ; i<bulebule.length; i++ )
            bulebule[i] = new Pelota();
        //Pelota bule = new Pelota(veloX,veloY);
        
        while(true){
            LienzoStd.limpia();
            for ( j=0 ; j<bulebule.length; j++ ){
                Wilson.Pinta();
                Losser.Pinta();
                bulebule[j].Pinta();
                LienzoStd.circulo(LienzoStd.ratonX(), LienzoStd.ratonY(), 10);
            }
            //LienzoStd.dibujo(25, 25, img);
            LienzoStd.mostrar(0);
            Thread.sleep(30);
            for ( j=0 ; j<bulebule.length; j++ ){
                bulebule[j].Mover();
                Wilson.Mover(bulebule[j]);
                Losser.Mover(bulebule[j]);
            }
        }
        
        
    }
    
}
