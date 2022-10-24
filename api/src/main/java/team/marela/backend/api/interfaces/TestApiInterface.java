package team.marela.backend.api.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team.marela.backend.database.entities.test.TestEntity;

@RequestMapping("/test")
public interface TestApiInterface {

    @GetMapping
    TestEntity test();
}
