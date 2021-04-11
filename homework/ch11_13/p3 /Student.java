public class Student extends Person{
    private String classNo;
    private String department;
    private int studentId;

    public Student(){

    }
    public Student(String name, int age, int studentId, String department, String classNo){
        super(name,age);
        this.studentId=studentId;
        this.department=department;
        this.classNo=classNo;
    }

    public int getStudentId(){
        return this.studentId;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getClassNo(){
        return this.classNo;
    }
    public void setClassNo(String classNo){
        this.classNo=classNo;
    }
    @Override
    public String toString(){
        return super.toString()+",studentId:"+this.getStudentId()+",department:"+this.getDepartment()+",classNo:"+this.getClassNo();
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            if(super.equals(obj))
            {
                return this.studentId == ((Student) obj).studentId && this.classNo.equals(((Student) obj).classNo)
                        && this.department.equals(((Student) obj).department);
            }
        }
        return false;
    }
    @Override
    public Object clone()
            throws CloneNotSupportedException{
        //Student A= new Student();
        Student copy=(Student) super.clone();

        return copy;
    }
}
