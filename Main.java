class Student{
      int id;
      String name;
      float stipend;

      Student(){}

      Student(int id,String name){
        this.id=id;
        this.name=name;
      }

      Student(int id, String name,float stipend) {
          this.id = id;
          this.name = name;
          this.stipend=stipend;
      }

      void displaydetails(){
        System.out.println(this.id+" | "+this.name+" | "+this.stipend);
      }
}
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student(12,"Tabassum");
        Student st3=new Student(9,"Ali" , 20000);

        st1.displaydetails();
        st2.displaydetails();
        st3.displaydetails();
}
}