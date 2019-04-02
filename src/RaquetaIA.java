
import edu.epromero.util.LienzoStd;
import java.awt.Color;
import edu.epromero.util.Imagen;

public class RaquetaIA {
    
    private int cx;
    private int cy;
    private Color miColor;
    private int medioAncho;
    private int largo;
    private Imagen img;
    
    void Inicia(int miCx, int miCy, int elMedioAncho, Color elColor){
        
        setCx(miCx); setCy(miCy); 
        setMiColor(elColor); 
        //img = new Imagen("pelota.jpg");
        setMedioAncho(elMedioAncho);
    }

    RaquetaIA(){
        Inicia((int)LienzoStd.pideLimiteXMax(),(int)LienzoStd.pideLimiteYMax(), 10, Color.DARK_GRAY);
        
    }
    
    void Pinta(){
        LienzoStd.ponColorLapiz(miColor);
        LienzoStd.RectanguloLleno(cx,cy,medioAncho,30);
    }
    
    void Mover(Pelota laPelota){
       setCy(laPelota.getCy());
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

    public Color getMiColor() {
        return miColor;
    }

    public void setMiColor(Color miColor) {
        this.miColor = miColor;
    }

    public int getMedioAncho() {
        return medioAncho;
    }

    public void setMedioAncho(int medioAncho) {
        this.medioAncho = medioAncho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Imagen getImg() {
        return img;
    }

    public void setImg(Imagen img) {
        this.img = img;
    }
    
    
    
    
}
