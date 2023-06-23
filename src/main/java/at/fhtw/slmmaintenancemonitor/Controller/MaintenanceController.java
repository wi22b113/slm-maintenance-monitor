package at.fhtw.slmmaintenancemonitor.Controller;

import at.fhtw.slmmaintenancemonitor.Monitor.Monitor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {

    Monitor mm = new Monitor();

    @RequestMapping("/api/message")
    public String getMessage (){
        return mm.getMessage();
    }

    @RequestMapping("api/message/set")
    public String setMessage (@RequestParam String m){
        mm.setMessage(m);
        return "ok";
    }


}
