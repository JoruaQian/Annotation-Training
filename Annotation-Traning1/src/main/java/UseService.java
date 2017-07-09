/**
 * Created by JoruaChan on 2017/7/8.
 */
public class UseService {

    BaseService baseService;

    public void setBaseService(BaseService baseService) {
        this.baseService = baseService;
    }

    /**
     * @Author: JoruaChan
     * @Description:
     * @Date: 下午10:47 2017/7/8
     */
    public String sayHello(String name){
        return baseService.sayHello(name);
    }
}
