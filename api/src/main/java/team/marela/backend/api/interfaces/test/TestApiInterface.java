package team.marela.backend.api.interfaces.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team.marela.backend.core.models.test.TestDto;

@RequestMapping("/test")
public interface TestApiInterface {

    @GetMapping
    TestDto test();
}
