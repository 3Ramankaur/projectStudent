

package student;

/**
 *
 * @author Ramandeep Kaur
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] details=new Student[3];
     details[0]=new Student("Raman", 21);
     details[1]=new Student("Karan",20);
     details[2]=new Student("Taniya",22);

     System.out.println("The student list");
     for(int i=0;i<details.length;i++){
         System.out.println(details[i].toString());}
    }

}
