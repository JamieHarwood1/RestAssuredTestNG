package webTests;

import configurations.WebTestConfig;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import properties.WebProperties;

import static io.restassured.RestAssured.when;

@Component
@SpringBootTest
@ContextConfiguration(classes = WebTestConfig.class)
public class ResponseTest extends AbstractTestNGSpringContextTests
{
	@Autowired
	private WebProperties webProperties;

	@BeforeClass
	public void setup()
	{
		RestAssured.baseURI = webProperties.getScheme() + "://" + webProperties.getUrl();
	}

	@Test
	public void givenUserMakesRequestToGoogle_responseIsOK()
	{
		when()
				.get(webProperties.getPath())
		.then()
				.statusCode(HttpStatus.SC_OK);
	}
}