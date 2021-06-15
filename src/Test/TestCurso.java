
package Test;

import Dominio1.Curso;

public class TestCurso {
  public static void main(String[] args){
      Curso cursoA = new Curso();
      double [] notas = new double[12];
      
      LlenaNotas(notas);
        cursoA.setNotas(notas);
        cursoA.setPromedio();
        cursoA.MostrarNotas();
        System.out.println("Promedio del curso= "+cursoA.getPromedio());
        cursoA.setEstudiantesEncimaPromedio();
        System.out.println("N° de estudiantes encima del promedio= "+
                cursoA.nroEstudianteEncimaPromedio());
        
  }
   public static void LlenaNotas(double[] notas){
      for(int i=0; i<12; i++){
          notas[i] = Math.random()*6;
      } 
       
   }
}
