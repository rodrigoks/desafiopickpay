package br.com.jbusiness.picpay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test") // Ativa application-test.yml
public class ProfileTest {

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Test
    void testProfileIsLoaded() {
        assertThat(datasourceUrl).isEqualTo("jdbc:h2:mem:testdb");
    }
}
