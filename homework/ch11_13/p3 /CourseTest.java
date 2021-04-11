public class CourseTest {
    public CourseTest() {

    }
    public static void main(String[] args) throws CloneNotSupportedException{
    Person teacher = new Faculty( "James Gosling",  65,  9000, "Professor" ,
    "http://nighthacks . com/ jag/bio/index.html" );
    Course javaCourse = new Course( "Java Language Programming" , teacher);
    Person student1 = new Student(  "aaa",  28,  28170101,  "cs",  "сS1784");
    Person student2 = new Student(  "bbb",  28,  20170182, "cs",  "CS1705");
    Person student3 = new Student(  "ccc",  20,  20170103,  "cs" ,  "CS1706");
    javaCourse . register( student1);
    javaCourse . register(student2);
    javaCourse. register( student3);
    System.out . println( javaCourse);
    javaCourse .unregister (student3);
    System.out . println(javaCourse);
    //测试是否为深拷贝
    Course javaCourse2 = (Course )javaCourse.clone();
    System.out . println( javaCourse. equals(javaCourse2));
    System.out.println( javaCourse . getCourseName() != javaCourse2 . getCourseName());
    System.out . println(javaCourse . getTeacher() != javaCourse2.getTeacher());
    System. out . println( javaCourse. getStudents() != javaCourse2 . getStudents());
    System. out . println(javaCourse2);
    }
}