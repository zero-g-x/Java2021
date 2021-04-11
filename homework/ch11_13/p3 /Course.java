import java.util.ArrayList;
import java.util.List;

public class Course extends Object
        implements Cloneable{
    private String courseName;
    private List<Person> students=new ArrayList<>();
    private Person teacher;

    public Course(){

    }
    public Course(String courseName, Person teacher)
    {
        this.courseName=courseName;
        this.teacher=teacher;
    }

    public void register(Person s){
        students.add(s);
    }
    public String getCourseName(){
        return this.courseName;
    }
    public List<Person> getStudents(){
        return this.students;
    }
    public Person getTeacher(){
        return this.teacher;
    }
    public void unregister(Person s){
        students.remove(s);
    }
    public int getNumberOfStudent(){
        return students.size();
    }
    @Override
    public Object clone()
            throws CloneNotSupportedException{
        Course A=new Course();
        A.courseName=this.courseName;
        if(this.teacher!=null)
        {
            A.teacher = (Faculty) this.teacher.clone();
        }
        if(this.students!=null){
            for (Person person : students) {
                if (person instanceof Student) {
                    Student student = (Student) person.clone();
                    A.register(student);
                }
            }
        }
        return A;
    }
    @Override
    public String toString(){
        String info= "courseName:"+this.courseName+"\nTeacher Info:"+this.teacher.toString()+"\nStudentList:";
        for(Person person : this.students){
            info+="\n+\t"+person.toString();
        }
        info+="\nTotally:"+this.students.size()+" students.";
        return info;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Course)
        {
            if(((Course)obj).courseName.equals(this.courseName)&&(((Course) obj).teacher.equals(this.teacher)))
            {
                return this.students.containsAll(((Course)obj).students)&&((Course)obj).students.size()==this.students.size();
            }
        }
        return false;
    }
}
