import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JoruaChan on 2017/7/8.
 */
@Configuration
public class JavaConfig {

    @Bean
    public BaseService findBaseService(){
        return new BaseService();
    }

    @Bean
    public UseService findUseService(BaseService baseService){
        UseService useService = new UseService();
        useService.setBaseService(baseService);
        return useService;
    }
}
