package com.prep.springsetup.kickstart.configuration;

import com.prep.springsetup.kickstart.repository.CartRepository;
import com.prep.springsetup.kickstart.repository.EmployeeRepo;
import com.prep.springsetup.kickstart.model.Cart;
import com.prep.springsetup.kickstart.model.Employee;
import com.prep.springsetup.kickstart.model.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


@Configuration
public class LoadH2Database {
    private static final Logger LOGGER = Logger.getLogger(LoadH2Database.class.getName());

    @Bean
    CommandLineRunner initH2DatabaseEmp(EmployeeRepo employeeRepo) {

        return args -> {
            LOGGER.info("Preloading " + employeeRepo.save(new Employee("chief1", "chief@cs.com")));
            LOGGER.info("Preloading " + employeeRepo.save(new Employee("cmd1", "cmd@armf.com")));
        };
    }

    @Bean
    CommandLineRunner initH2DatabaseCartItem(CartRepository cartRepository) {
        Cart cart = new Cart("Cart 1");
        Item item1 = new Item("Choco", cart);
        Item item2 = new Item("Bar", cart);
        List<Item> items = Arrays.asList(item1, item2);
        cart.setItems(items);

        return args -> {
            LOGGER.info("Preloading " + cartRepository.save(cart));
        };
    }
}
