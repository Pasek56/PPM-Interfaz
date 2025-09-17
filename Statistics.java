package Back;
import javax.swing.JOptionPane;

public class Statistics extends Start{
    
    public static String Diferencial(int[] PPM, String[] Codes, String[] Nombre){
        StringBuilder Return = new StringBuilder();
        int[] PPMPast = new int[PPM.length];

        for(int i = 0; i < PPM.length; i++){
            String Data;
            boolean entradaValida = false;

            while (!entradaValida) {
                Data = JOptionPane.showInputDialog("Ingrese el PPM Pasado de " + Nombre[i] + " : " + PPM[i]);
                if(Data == null){
                    return "Operación Cancelada";
                }
                Data = Data.trim();
                if(Data.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No se ingresó ningún valor");
                    continue;
                }
                boolean esNumerico = true;
                for(int j = 0; j < Data.length(); j++){
                    if(!Character.isDigit(Data.charAt(j))){
                        esNumerico = false;
                        break;
                    }
                }
                if(!esNumerico){
                    JOptionPane.showMessageDialog(null, "Por favor ingrese solo números");
                    continue;
                }
                PPMPast[i] = Integer.parseInt(Data);
                entradaValida = true;
            }
        }
        int Crecimiento = 0;
        int Decrecimiento = 0;
        int Neutral = 0;
        int Mayor = 0;
        String ParqueToxic = "";
        StringBuilder Rise = new StringBuilder();
        StringBuilder Down = new StringBuilder();
        StringBuilder New = new StringBuilder();

        for(int i = 0; i < PPM.length; i++){
            int Diference = PPM[i] - PPMPast[i];
            if(Diference > 0){
                Crecimiento++;
                Rise.append(Nombre[i]).append(" ,");
                if(Diference > Mayor){
                    Mayor = Diference;
                    ParqueToxic = Codes[i];
                }
            }else if(Diference < 0){
                Decrecimiento++;
                Down.append(Nombre[i]).append(" ,");
            }else if(Diference == 0){
                Neutral++;
                New.append(Nombre[i]).append(" ,");
            }
        }
        Return.append("-------Reporte General-------");
        Return.append("\n").append("\n Cantidad de Parques con Aumento de contaminacion ").append(Crecimiento).append("\n").append(" ").append(" Nombres: ").append(Rise);
        Return.append("\n").append("\n Cantidad de parques con Decrecion de contaminacion: ").append(Decrecimiento).append("\n").append(" Nombres: ").append(" ").append(Down).append("\n");
        Return.append("\n").append("\n Cantidad de Parques con PPM sin alteracion: ").append(Neutral).append(" Nombres: ").append("\n").append(" ").append(New).append("\n");
        Return.append("\n Parque más contaminado: ").append(ParqueToxic).append(" || Nivel de Contaminacion: ").append(Mayor);
        return Return.toString();
    }
}