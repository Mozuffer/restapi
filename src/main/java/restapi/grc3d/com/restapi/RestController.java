package restapi.grc3d.com.restapi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

public class RestController {

    Logger logger = LoggerFactory.getLogger(RestController.class);

    @RequestMapping("/hello")
    public String Hello(){
        logger.info("Error Happend");
        return "<center><h1>Welcome to SpringBoot</h1></center>";
    }
}
