import com.java.entity.School;
import com.java.entity.Student;
import com.java.entity.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDI {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println("使用setter方法注入");
        System.out.println("id:"+student.getId());
        System.out.println("name:"+student.getName());
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        System.out.println("使用构造器实例化bean");
        System.out.println("id:"+teacher.getId());
        System.out.println("sex:"+teacher.getSex());
        System.out.println("name:"+teacher.getName());
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        School school = (School) applicationContext.getBean("school");
        System.out.println("复杂类型的注入");
        System.out.println("id:"+school.getId());
        System.out.println("teacher:"+school.getTeacher().getName());
        System.out.println("student:"+school.getStudent().getName());
    }

    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("studentFactory");
        student.setId(1);
        student.setName("李四");
        System.out.println("使用静态工厂实例化bean");
        System.out.println("id:"+student.getId());
        System.out.println("name:"+student.getName());
    }

    @Test
    public void test5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher1 = (Teacher) applicationContext.getBean("teacher1");
        teacher1.setId(1);
        teacher1.setName("李四");
        System.out.println("非静态工厂实例化bean");
        System.out.println("id:"+teacher1.getId());
        System.out.println("name:"+teacher1.getName());
    }
}
