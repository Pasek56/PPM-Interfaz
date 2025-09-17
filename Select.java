package Back;

import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author miguel
 */
public class Select extends Start{
    public static int Suma(int[] Sum){
        int Suma=0;
        for(int Value: Sum){
            Suma += Value;
        }
        return Suma;
    }

    public static double Promedio(int[] Sum){
        if(Sum.length == 0){
            return 0.0;
        }
        int suma = Suma(Sum);
        return (double) suma/ Sum.length;
    }
    
    public static ArrayList<Integer> Rangesearch(int[] A,int min, int Max){
        ArrayList<Integer> resultados = new ArrayList<>();
        for(int i: A){
            if(i >= min && i<= Max){
                resultados.add(i);
            }
        }
        return resultados;
    }
    public static String PrintSearch(String[] names, String[] codes, int[] ppms, String[] classifications, int minPPM, int maxPPM){
        
        ArrayList<Integer> parquesEnRango = Select.Rangesearch(ppms, minPPM, maxPPM);
        int ParksFounds = 0;    
        String Value = ""; 

    if (parquesEnRango.isEmpty()) {
        Value = "No se encontraron parques en el rango de " + minPPM + " a " + maxPPM + " PPM.";
    } else {
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("Parques con niveles de contaminacion entre ").append(minPPM).append(" y ").append(maxPPM).append(" PPM:\n");

        for (int i : parquesEnRango) {
            if (ppms[i] >= minPPM && ppms[i] <= maxPPM) {
                resultBuilder.append("Nombre: ").append(names[i]).append(", Código: ").append(codes[i])
                             .append(", PPM: ").append(ppms[i]).append(", Clasificación: ").append(classifications[i]).append("\n");
                ParksFounds++;
            }
        }
        
        double percentage = (ParksFounds * 100.0) / ppms.length;
        
        resultBuilder.append("Los parques encontrados fueron: ").append(ParksFounds)
                     .append(" (").append(String.format("%.2f", percentage)).append("%)");
        
         Value = resultBuilder.toString();
    }
        
    return Value;
    }
    
    public static String PercentageClasificacion(String[] Clasific){
        Map<String, Integer> counts = new HashMap<>();
        StringBuilder Sout = new StringBuilder();
        String Filter;
        for(String Classific: Clasific){
            counts.put(Classific, counts.getOrDefault(counts, 0) + 1);
        }
        int ParquesTotales = Clasific.length;
        
        for(Map.Entry<String, Integer> entry : counts.entrySet()){
            String Category = entry.getKey();
            int Cont = entry.getValue();
            double Percentage = (double) Cont/ParquesTotales*100;
            Sout.append("Categoria: ").append(Category).append(" %").append("Cantidad: ").append(Cont).append("Porcentaje: ").append(Percentage).append(" %");
        }
        Sout.append("Cantidad de Parques: ").append(ParquesTotales);
        
        Filter = Sout.toString();
        return Filter;
    }
    public static String Search(String[] Nombre, String[] Codigo, String[] Clasificacion, String Find){

        StringBuilder False = new StringBuilder();
        String CC;
        boolean Search = false;
        
        for(int i=0; i<Codigo.length;i++){
            if(Codigo[i].equals(Find)){
                False.append("El Parque Existe").append(" El Parque es: ").append(Nombre[i]).append(" Su Clasificacion es: ").append(Clasificacion[i]);
                Search = true;
            }
        }
        if(!Search){
            False.append("Parque no Registrado.");
        }
        CC = False.toString();
        return CC;
    }
}
