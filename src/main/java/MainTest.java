import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by JoruaChan on 2017/7/8.
 */
public class MainTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseService useService = applicationContext.getBean(UseService.class);
        System.out.println(useService.sayHello("JoruaChan"));
        applicationContext.close();
    }
}
