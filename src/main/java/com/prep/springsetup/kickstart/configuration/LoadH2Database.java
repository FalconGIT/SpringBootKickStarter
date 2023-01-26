package com.prep.springsetup.kickstart.configuration;

import com.prep.springsetup.kickstart.data.EmployeeRepo;
import com.prep.springsetup.kickstart.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.logging.Logger;


@Configuration
public class LoadH2Database {
    private static final Logger LOGGER = Logger.getLogger(LoadH2Database.class.getName());

    @Bean
    CommandLineRunner initDatabase(EmployeeRepo employeeRepo) {

        return args -> {
            LOGGER.info("Preloading " + employeeRepo.save(new Employee("chief1", "chief@cs.com")));
            LOGGER.info("Preloading " + employeeRepo.save(new Employee("cmd1", "cmd@armf.com")));
        };
    }
}
