package demo.sayantan.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)
@Slf4j
public class App implements CommandLineRunner
{
    private final MyConfiguration configuration;

    public App(final MyConfiguration configuration) {
        this.configuration = configuration;
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        log.info("----------------------------------------");
        log.info("Configuration properties");
        log.info("   example.username is {}", configuration.getUsername());
        log.info("   example.password is {}", configuration.getPassword());
        log.info("----------------------------------------");
    }
}
