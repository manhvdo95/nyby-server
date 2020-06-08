package com.rysk.nybyserver.configs;

import com.opentable.db.postgres.embedded.EmbeddedPostgres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@Profile("local")
public class EmbeddedPostgresConfig {

    @Bean
    DataSource dataSource() throws IOException {
        return EmbeddedPostgres.builder()
                .setPort(5432)
                .start()
                .getPostgresDatabase();
    }

}
