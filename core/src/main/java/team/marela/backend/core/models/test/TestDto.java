package team.marela.backend.core.models.test;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestDto {
    private UUID id;
    private String name;
}
