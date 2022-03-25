package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.QuoteService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		QuoteService quoteService = context.getBean(QuoteService.class);

		//quoteService.getQuoteSync();
		quoteService.getQuoteAsync();
	}

}
