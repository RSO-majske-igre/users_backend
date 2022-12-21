package team.marela.backend.database.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import team.marela.backend.database.BaseRepository;
import team.marela.backend.database.entities.DormEntity;
import team.marela.backend.database.entities.ParticipantEntity;

import java.util.Optional;

public interface ParticipantRepository extends BaseRepository<ParticipantEntity> {
    Page<ParticipantEntity> findByDorm(DormEntity dorm, Pageable pagination);

    Optional<ParticipantEntity> findByEmail(String email);
}
