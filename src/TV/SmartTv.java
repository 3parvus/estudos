public class SmartTv {
    boolean estadoTv = false;
    int Volume = 25;
    int Canal = 1;

    public boolean estadoTv(boolean estado){
        estado = estadoTv ?  true :  false;
        return estadoTv;
    }
    public int aumentarVolume(int Volume){        
       Volume += Volume;
        return Volume;
    }
    public int diminuirVolume(int Volume){
        Volume -=Volume;
        return Volume;
    }
    
}
