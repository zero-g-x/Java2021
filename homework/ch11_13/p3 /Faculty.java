public class Faculty extends Person{
    private int facultyId;
    private String title;
    private String email;
    public Faculty(){

    }
    public Faculty(String name,
                   int age,
                   int facultyId,
                   String title,
                   String email){
        super(name,age);
        this.facultyId=facultyId;
        this.title=title;
        this.email=email;
    }
    public int getFacultyId(){
        return this.facultyId;
    }
    public void setFacultyId(int facultyId){
        this.facultyId=facultyId;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    @Override
    public String toString(){
        return super.toString()+",facultyId"+this.facultyId+",title:"+this.title+",email"+this.email;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Faculty)
        {
            if(super.equals(obj))
            {
                return this.email.equals(((Faculty) obj).email) && this.facultyId == ((Faculty) obj).facultyId
                        && this.title.equals(((Faculty) obj).title);
            }
        }
        return false;
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        Faculty A=(Faculty)super.clone();
        A.facultyId=this.facultyId;
        A.email=this.email;
        A.title=this.title;
        return A;
    }
}
