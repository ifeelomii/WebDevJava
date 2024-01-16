import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceBundlingTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Marathi\n2.GB English\n3.US English\n4.Default");
		int choice = sc.nextInt();
		MessageSource ms = (MessageSource) ctx.getBean("messageSource");
		Locale locale = null;
		String m, w, d, c;
		switch (choice) {
		case 1:
			locale = new Locale("ma","IN");
			System.out.println("Language: "+locale.getLanguage()+" Country: "+locale.getCountry());
			break;
		case 2:
			locale = Locale.UK;
			System.out.println("Language: "+locale.getLanguage()+" Country: "+locale.getCountry());
			break;
		case 3:
			locale = Locale.JAPAN;
			System.out.println("Language: "+locale.getLanguage()+" Country: "+locale.getCountry());
			break;
		default:
			break;
		}
		m=ms.getMessage("msg.pay", null, locale);
		w=ms.getMessage("msg.welcome",new Object[]{"Omkar"}, locale);
		d=ms.getMessage("msg.data", null, locale);
		c=ms.getMessage("msg.currency",null, locale);
		
		System.out.println("Message: "+m);
		System.out.println("welcome: "+w);
		System.out.println("Data: "+d);
		System.out.println("Currency: "+c);
	}

}
