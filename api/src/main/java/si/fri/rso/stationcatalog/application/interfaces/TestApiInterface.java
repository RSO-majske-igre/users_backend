package si.fri.rso.stationcatalog.application.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
public interface TestApiInterface {

    @GetMapping
    String test();
}
