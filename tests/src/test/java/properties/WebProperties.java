package properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "web")
public class WebProperties
{
	private String url;
	private String scheme;
	private String path;
}