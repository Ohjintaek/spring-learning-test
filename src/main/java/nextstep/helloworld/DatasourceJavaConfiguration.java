package nextstep.helloworld;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Profile("mem")
@Configuration
public class DatasourceJavaConfiguration {
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.username("SA");
        dataSourceBuilder.password("");
        dataSourceBuilder.url("jdbc:h2:mem:test");
        return dataSourceBuilder.build();
    }
}
