

package student;

/**
 *
 * @author Ramandeep Kaur
 */
public class Student {

     private String name;
    private int age;
    private boolean parttime;
    
 public Student(String name, int age){
     this.name=name;
     this.age=age;}
 
 public String toString(){
     return("Student name: "+ name + " age: "+age);}

    /**
     * @return the parttime
     */
    public boolean isParttime() {
        return parttime;
    }

    /**
     * @param parttime the parttime to set
     */
    public void setParttime(boolean parttime) {
        this.parttime = parttime;
    }

}
