import java.io.InputStream;
import java.util.Scanner;

public class helloworld {
    public static void main(String args[]){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入小朋友的姓名：");
        String name = sc.next();
        System.out.println("请输入小朋友的年龄：");

        System.out.println("请输入小朋友的性别：");*/

        friends xiaoming = new friends("xiaobi","nan",11);
        xiaoming.findFriend();
    }
}

class friends{
    String sex;
    int age;
    String name;

    public friends(String name, String sex, int age){
        this.age=age;
        this.name=name;
        this.sex=sex;

    }

    public void findFriend(){
        System.out.println(name+"的性别是："+sex+"，年龄是："+age);
    }
}