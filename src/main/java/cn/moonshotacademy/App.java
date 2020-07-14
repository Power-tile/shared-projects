package cn.moonshotacademy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.moonshotacademy.PackageInterface;
import cn.moonshotacademy.HelloInterface;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        // HelloInterface hello = ac.getBean("HelloWorld1", HelloInterface.class);
        PackageInterface package = (PackageInterface)ac.getBean("package");
        // hello.show();
    }
}
