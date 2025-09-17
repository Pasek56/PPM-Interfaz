package Back;

public class Start extends Declaracion{

    public String[] getName() {
        return Name;
    }

    public void setName(String[] Name) {
        this.Name = Name;
    }

    public int[] getPastPPM() {
        return PastPPM;
    }

    public void setPastPPM(int[] PastPPM) {
        this.PastPPM = PastPPM;
    }

    public int[] getPPM() {
        return PPM;
    }

    public void setPPM(int[] PPM) {
        this.PPM = PPM;
    }

    public String[] getCode() {
        return Code;
    }

    public void setCode(String[] Code) {
        this.Code = Code;
    }

    public String[] getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String[] Clasificacion) {
        this.Clasificacion = Clasificacion;
    }
    
    public void Clasificacion(){
        if(this.PPM == null || this.PPM.length == 0){
            System.out.println("Niveles de toxicidad no registrados");
        }
        this.Clasificacion = new String[this.PPM.length];
        for(int i=0; i<this.PPM.length; i++){
            int PMN = this.PPM[i];
            if(PMN <=50 && PMN > 0){
                Clasificacion[i] = "Buena || Verde";
            }else if(PMN <=100 && PMN > 50){
                Clasificacion[i] = "Moderada || Amarillo";
            }else if(PMN <=150 && PMN > 100){
                Clasificacion[i] = "Insalubre || Naranja";
            }else if(PMN <=200 && PMN > 150){
                Clasificacion[i] = "Muy Insalubre || Rojo";
            }else if(PMN > 200){
                Clasificacion[i] = "Peligrosa || Morada";
            }
        }
    }

    public String MaxtMin(String[] AlphaCoder, int[] PMM){
        int Max = PMM[0];
        int Min = PMM[0];
        int MinIndex = 0;
        int MaxIndex = 0;
        for(int i=0; i<PMM.length;i++){
            if(PMM[i] > Max){
                Max = PMM[i];
                MaxIndex = i;
                }if(PMM[i] < Min){
                    Min = PMM[i];
                    MinIndex = i;
            }
        }
        String Msg = "Parque con Mayor contaminacion: "+AlphaCoder[MaxIndex]+" Nivel de Contaminacion: "+Max+"\n Parque con Menor Contaminacion: "+AlphaCoder[MinIndex]+" Nivel de COntaminacion: "+Min;
        return Msg;
    }
}