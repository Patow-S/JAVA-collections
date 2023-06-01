package pe.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejemplo1 {
	public static void main(String[] args) {
	    String var1 = "Ejem 1 ";
	    String var2 = "Ejem 2 ";
	    String var3 = "Ejem 3 ";
	    String var4 = "Ejem 4 ";

	    ArrayList<String> lista = new ArrayList<String>();
	    lista.add(var1);
	    lista.add(var2);
	    lista.add(var3);
	    lista.add(var4);

	    System.out.println(lista);
	    System.out.println();

//	    lista.remove(2);

	    System.out.println(lista);
	    System.out.println();

//	    lista.set(2, "Ejemplo alterado");
	    System.out.println(lista);
	    System.out.println();

	    System.out.println(lista.size()); //Esto es un metodo y me retorna el tamaño de la lista
//FOR
	    // for tradicional,
	    for (int i = 0 ; i < lista.size(); i++){
	    	System.out.println(lista.get(i));
	    }
	    
	    //tipo forEach	
	    for(String clase : lista) {
	    	System.out.println(clase);
	    }
	    
	    //forEach recurso de lambdas JAVA8+
	    lista.forEach(clase -> {
	    	System.out.println(clase);
	    });
//COLLECTIONS
	    //ascendete
	    Collections.sort(lista);
	    System.out.println(lista);
	    //descendente
	    Collections.sort(lista, Collections.reverseOrder());
	    System.out.println(lista);
	    
	    lista.sort(Comparator.reverseOrder());
	    System.out.println(lista);
	   
	   	lista.sort(Comparator.naturalOrder());
	   	System.out.println(lista);
	   	


	    

	
	}
}