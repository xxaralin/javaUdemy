public class javaObject extends Object{
    public static void main(String[] args) {
        Student max=new Student("max",21);
        System.out.println(max.toString());
        babyStudent jimmy=new babyStudent("Jimmy",5,"Karen");
        System.out.println(jimmy);

    }
}
class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
//    public String toString(){
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name+" is "+age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class babyStudent extends Student{
    private String parentName;
    babyStudent(String name, int age, String parentName){
        super(name,age);
        this.parentName=parentName;
    }

    @Override
    public String toString() {
        return parentName+"s kid, " + super.toString();
    }
}
