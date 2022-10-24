package team.marela.backend.api.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import team.marela.backend.ConfigurationDatabase;

@Configuration
@Import(value = {ConfigurationDatabase.class})
public class ApplicationConfiguration {
}
