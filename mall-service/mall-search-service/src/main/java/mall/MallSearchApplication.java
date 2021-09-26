package mall;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients(basePackages =
        {"mall.goods.feign"
                //,"mall.search.feign"
        })
public class MallSearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallSearchApplication.class);
    }
}
