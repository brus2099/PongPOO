
import edu.epromero.util.LienzoStd;
import edu.epromero.util.StdRandom;
import java.awt.Color;
import edu.epromero.util.Imagen;

//¿quienes son?
//¿cuales son sus responsabilidades? debe saber rebotar, y moverse, saber pintarse a si misma y saber borrarse
////¿cual es su conocimiento y comportamiento?
//de cuantas maneras puedo ck¿onstruir este objeto?

public class Pelota {
    
    private int cx;
    private int cy;
    private int medioancho;
    private Imagen img;
    private Color color;
    private double compHor;
    private double compVer;
    private boolean VoyPaLaDerecha;
    private boolean VoyPaAbajo;
    
    
    void Inicia(int miCx, int miCy, int miRadio, Color miColor, double CH, double CV){
        
        setCx(miCx); setCy(miCy); setMedioancho(miRadio); 
        setColor(miColor); setCompHor(CH); setCompVer(CV);
        this.setVoyPaAbajo(false);
        this.setVoyPaLaDerecha(true);
        img = new Imagen("pelota.jpg");
        setMedioancho(img.ancho()/2);
    }
    
    Pelota(){
        
        Inicia(StdRandom.uniforme((int)LienzoStd.pideLimiteXMax()),
               StdRandom.uniforme((int)LienzoStd.pideLimiteYMax()),
               StdRandom.uniforme(10), Color.RED, 1, 1);
        
    }
    
    Pelota(int Cx, int Cy, Color c, int r){
        
        Inicia(Cx, Cy, r, c, 1, 1);
        
    }
    
    void Pinta(){
//        
//        LienzoStd.ponColorLapiz(color);
//        LienzoStd.circuloLleno(cx, cy, radio); 
        LienzoStd.dibujo(cx, cy, img);
        
    }
    
    void Mover(){
        if (this.isVoyPaLaDerecha()){
            cx+=10;
            if (cx+medioancho > LienzoStd.pideLimiteXMax())
                setVoyPaLaDerecha(false);
        }
        else{
            cx-=10;
            if (cx-medioancho < LienzoStd.pideLimiteXMin())
                setVoyPaLaDerecha(true);
        }
        
        if (this.isVoyPaAbajo()){
            cy+=10;
            if (cy+medioancho > LienzoStd.pideLimiteYMax())
                setVoyPaAbajo(false);
        }
        else{
            cy-=10;
            if (cy-medioancho < LienzoStd.pideLimiteYMin())
                setVoyPaAbajo(true);
        }
        
    }
    
    
    
    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public int getMedioancho() {
        return medioancho;
    }

    public void setMedioancho(int medioancho) {
        this.medioancho = medioancho;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCompHor() {
        return compHor;
    }

    public void setCompHor(double compHor) {
        this.compHor = compHor;
    }

    public double getCompVer() {
        return compVer;
    }

    public void setCompVer(double compVer) {
        this.compVer = compVer;
    }
    
    
    public boolean isVoyPaLaDerecha() {
        return VoyPaLaDerecha;
    }

    public void setVoyPaLaDerecha(boolean VoyPaLaDerecha) {
        this.VoyPaLaDerecha = VoyPaLaDerecha;
    }

    public boolean isVoyPaAbajo() {
        return VoyPaAbajo;
    }

    public void setVoyPaAbajo(boolean VoyPaAbajo) {
        this.VoyPaAbajo = VoyPaAbajo;
    }
    
}
