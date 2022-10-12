package com.functionalProgramming.EjercicioBiConsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        String[][] arreglo = {{"Raju","India"},{"Tori","Usa"},{"Boris","Rusia"},{"Miyagui","Japón"}};

        //ASÍ SE RECORRIA Y CARGABA ANTES UN MAP
        for(int i=0;i< arreglo.length;i++) {
            map.put(arreglo[i][0], arreglo[i][1]);
        }
        System.out.println("Usando la forma tradicional de imprimir clave y valor de un map");
        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
        if(iter!=null){
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                System.out.println("Clave: " + entry.getKey() + "\t" + " Valor: " + entry.getValue());
            }
        }
        System.out.println("\nUsando BiConsumer y expresiones Lambdas");
        map.forEach((key, value) -> {
            System.out.println("Clave: " + key +"\t"+ "Value: "+ value);});
    }
}
