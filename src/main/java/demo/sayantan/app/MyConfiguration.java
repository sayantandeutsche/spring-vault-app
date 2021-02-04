package demo.sayantan.app;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties("example")
@Data
public class MyConfiguration {

    private String username;
    private String password;

}
