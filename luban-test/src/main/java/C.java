import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author niuchangmeng
 * @date 2020/4/21 12:11
 */
public class C {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(A.class);

		System.out.println(ac.getBean(A.class));


	}
}
