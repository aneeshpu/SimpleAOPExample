import com.aneesh.aop.MyAspect;
import com.aneesh.aop.MyTarget;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: aneeshpu
 * Date: 8/6/12
 * Time: 6:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class Bootstrap {

    public static void main (String[] args){

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        annotationConfigApplicationContext.scan("com.aneesh");
        MyTarget myTarget = annotationConfigApplicationContext.getBean(MyTarget.class);

        String greeting = myTarget.greet();
        System.out.println(greeting);
    }
}
