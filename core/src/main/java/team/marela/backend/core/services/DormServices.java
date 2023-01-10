package team.marela.backend.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.marela.backend.core.exceptions.DataNotFoundException;
import team.marela.backend.core.mappers.DtoMapper;
import team.marela.backend.core.models.DormDto;
import team.marela.backend.database.entities.DormEntity;
import team.marela.backend.database.repositories.DormRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DormServices {

    private final DormRepository dormRepository;
    private final DtoMapper<DormEntity, DormDto> mapper = new DtoMapper<>(DormEntity.class, DormDto.class);

    public List<DormDto> getDorms() {
        return dormRepository.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }

    public DormDto getDormById(UUID id) {
        return mapper.toDto(
                dormRepository.findById(id)
                        .orElseThrow(DataNotFoundException::new)
        );
    }

    public DormDto saveDorm(DormDto dorm) {
        return mapper.toDto(
                dormRepository.save(
                        mapper.toEntity(dorm)
                )
        );
    }
}
