package si.fri.rso.stationcatalog.application.endpoints;

import org.springframework.web.bind.annotation.RestController;
import si.fri.rso.stationcatalog.application.interfaces.TestApiInterface;

@RestController
public class TestApi implements TestApiInterface {

    @Override
    public String test() {
        return "test OK";
    }
}
