package com.prep.springsetup.kickstart;

import com.prep.springsetup.kickstart.data.CartRepository;
import com.prep.springsetup.kickstart.model.Cart;
import com.prep.springsetup.kickstart.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

@EnableSwagger2
@SpringBootApplication
public class KickstartApplication {

	static ConfigurableApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(KickstartApplication.class, args);
//		loadH2DB();
	}

	public static void loadH2DB() {
		CartRepository cartRepository = applicationContext.getBean(CartRepository.class);
		Cart cart = new Cart("Cart 1");
		Item item1 = new Item("Foo", cart);
		Item item2 = new Item("Bar", cart);
		List<Item> items = Arrays.asList(item1, item2);
		cart.setItems(items);
//		cartRepository.save(cart);
//		cartRepository.delete(cart);
	};

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.prep.springsetup.kickstart")).build();
	}
}
