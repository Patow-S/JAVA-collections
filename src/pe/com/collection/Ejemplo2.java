package pe.com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo2 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Matematica",20);
		Curso curso2 = new Curso("Fiscica",40);
		Curso curso3 = new Curso("Quimica",15);
		Curso curso4 = new Curso("Algebra",23);
		
	    ArrayList<Curso> cursos = new ArrayList<Curso>();
		
	        cursos.add(curso1);
	        cursos.add(curso2);
	        cursos.add(curso3);
	        cursos.add(curso4);
	        
	        System.out.println(cursos);
	        
	        Collections.sort(cursos);
	}
}
