package exception02;

/**
 * ClassName: Test2
 * Package: exception02
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/22-22:47
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.regist(10);
        System.out.println(s1);// Student{id=10}

        s1.regist(-10);
        System.out.println(s1);
        // Exception in thread "main" java.lang.RuntimeException: id不正确
        //	at exception02.Student.regist(Test2.java:29)
        //	at exception02.Test2.main(Test2.java:17)
    }
}

class Student{
    int id;

    public  void regist(int id){
        if(id > 0){
            this.id = id;
        }else{
            throw new RuntimeException("id不正确");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
