package sk.upjs.ics.novotnyr.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("sk.upjs.ics.novotnyr.springmvc")
public class WebApplicationContext {
    /*
     * všetky beany sa odhalia automaticky
     */
}