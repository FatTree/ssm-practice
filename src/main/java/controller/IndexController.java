package controller;

import common.ApplicationException;
import common.ResEnv;
import entity.Sensor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.IndexService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tneciv on 2-26-0026.
 */
@Controller
public class IndexController {

    @Resource
    private IndexService indexService;

    @RequestMapping("/index")
    public String index() {
        return "/index/index";
    }
    @RequestMapping("/index2")
    public String index2() {
        return "/dist/index";
    }

    @RequestMapping("/index3")
    public String index3() {
        return "/index";
    }
    
    @RequestMapping(value = "/sensor", method = RequestMethod.GET)
    @ResponseBody
    public ResEnv<List<Sensor>> fetchSensorsByName(String name) {
        List<Sensor> sensorList = new ArrayList<>();

        try {
            sensorList = this.indexService.getSensorByName(name);
        } catch (ApplicationException e) {
            return ResEnv.fail(e.getMessage());
        } catch (Exception e) {
            return ResEnv.fail("获取数据异常");
        }
        return ResEnv.success(sensorList);

    }

}
