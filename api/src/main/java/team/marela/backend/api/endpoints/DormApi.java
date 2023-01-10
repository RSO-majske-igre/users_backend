package team.marela.backend.api.endpoints;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import team.marela.backend.api.interfaces.DormApiInterface;
import team.marela.backend.core.models.DormDto;
import team.marela.backend.core.services.DormServices;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class DormApi implements DormApiInterface {

    private final DormServices dormServices;

    @Override
    public List<DormDto> getDorms() {
        return dormServices.getDorms();
    }

    @Override
    public DormDto getDormById(UUID id) {
        return dormServices.getDormById(id);
    }

    @Override
    public DormDto postDorm(DormDto dorm) {
        return dormServices.saveDorm(dorm);
    }

    @Override
    public DormDto putDorm(DormDto dorm) {
        return dormServices.saveDorm(dorm);
    }
}
