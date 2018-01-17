import java.util.*;

public class VectorExample{
  static public void main(String...args){
    Vector<String> fruitsVector = new Vector<String>(5);

    fruitsVector.addElement("Apple");
    fruitsVector.addElement("Orange");
    fruitsVector.addElement("Mango");
    fruitsVector.addElement("Fig");
    fruitsVector.addElement("Apple");

    Enumeration em = fruitsVector.elements();
    while(em.hasMoreElements()) {
      System.out.println(em.nextElement());
    }
  }
}
