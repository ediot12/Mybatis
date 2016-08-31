package spring.chap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForAop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] configLocations = new String[]{"applicationContext.xml","commonConcern.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		WriteArticleService articleService = (WriteArticleService) context.getBean("writeArticleService");
		/*WriteArticleService articleService = context.getBean("writeArticleService",WriteArticleService.class);*/
		articleService.write(new Article());

	}

}
