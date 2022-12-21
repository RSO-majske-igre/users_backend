package team.marela.backend.database.repositories;

import team.marela.backend.database.BaseRepository;
import team.marela.backend.database.entities.DormEntity;

import java.util.Optional;

public interface DormRepository extends BaseRepository<DormEntity> {
    Optional<DormEntity> findByDormName(String dormName);
}
