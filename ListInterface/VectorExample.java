public class VectorExample{
  static public void main(String...args){
    List<String> fruitsVector = new Vector<String>(5);

    fruitsVector.addElement("Apple");
    fruitsVector.addElement("Orange");
    fruitsVector.addElement("Mango");
    fruitsVector.addElement("Fig");
    fruitsVector.addElement("Apple");

    while(fruitsVector.hasMoreElements()) {
      System.out.println(fruitsVector.nextElement());
    }
  }
}
