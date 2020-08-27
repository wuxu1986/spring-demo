import com.csdn.config.MyConfiguration;
import com.csdn.config.PersonConfig;
import com.csdn.domain.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
       /* ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person)context.getBean("person");
        System.out.println(person);*/

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PersonConfig.class);
        for (String s : context.getBeanDefinitionNames()) {
            System.out.println(s);
        }
    }
}
