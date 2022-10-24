package team.marela.backend.database.repositories.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.marela.backend.database.BaseRepository;
import team.marela.backend.database.entities.test.TestEntity;

import java.util.UUID;

public interface TestRepository extends BaseRepository<TestEntity> {
}
