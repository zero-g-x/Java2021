public class Person extends Object
        implements Cloneable{
    private int age;
    private String name;

    Person(){

    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    @Override
    public String toString(){
        return "name:"+this.getName()+",age:"+this.getAge();
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person) {
            return this.age == ((Person) obj).age && this.name.equals(((Person) obj).name);
        }
        return false;
    }
    @Override
    public Object clone()
            throws CloneNotSupportedException{
        Person copy=(Person)super.clone();
        copy.age=this.age;
        copy.name=this.name;
        return copy;
    }
}
