package configurations;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.mockito.internal.matchers.Equals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import properties.WebProperties;

import static io.restassured.RestAssured.when;

@Configuration
@EnableConfigurationProperties(WebProperties.class)
public class WebTestConfig
{
}