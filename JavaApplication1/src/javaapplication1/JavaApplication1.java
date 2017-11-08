/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*; //Importując z gwiazdką, importujesz wszystko, co jest w pakiecie, więc nie wiesz dokładnie co importujesz.
/**
 *
 * @author Gal Anonim
 */
public class JavaApplication1 {
//TODO: Spróbuj skompilować i odpalić ten program z konsoli  (polecenia javac i java)
    //TODO: Wczytaj listę słow do wyświetlenia z konsoli np. java javaaplication1.JavaAplication1 jeden dwa trzy cztey
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarując zmienną używaj interfejsów, nie implementacji ArrayList implementuje interfejs List. Poczytaj o listach w Javie. ArrayList, LinkedList
        ArrayList<String> slowa = new ArrayList<String>();//raczej używaj angielskich słów
        slowa.add("jeden");
        slowa.add("dwa");
        slowa.add("trzy");
        slowa.add("cztery");
        // Jest metodoa robiąca to w jednej linijce: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-
         Random generator = new Random();
          int i; // w Javie deklarujemy zmienne jak najbliżej miejsca wykożystania. Ta zmienna powinna być zadeklarowana w pętli.
          for(int j=0; j<100;j++)
          {
          i=generator.nextInt(4);
          System.out.println(slowa.get(i));
          }
    
 
        //kod nie jest sformatowany. brakuje wcięć. IDE powinno ci to umożłiwiać.
                
        
        
        
        
    }
    
}
