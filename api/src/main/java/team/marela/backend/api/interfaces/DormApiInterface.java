package team.marela.backend.api.interfaces;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import team.marela.backend.core.models.DormDto;
import team.marela.backend.core.models.ParticipantDto;
import team.marela.backend.core.validators.NotNullUUIDValidationGroup;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@RequestMapping("/dorms")
public interface DormApiInterface {
    @GetMapping
    @Operation(summary = "Returns dorms")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns list of dorms", content = @Content)
    })
    List<DormDto> getDorms();

    @GetMapping("/{id}")
    @Operation(summary = "Returns dorm with given ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns dorm", content = @Content),
            @ApiResponse(responseCode = "404", description = "Dorm with given ID not found"),
    })
    DormDto getDormById(
            @Parameter(description = "UUID of dorm")
            @PathVariable UUID id
    );

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Creates new dorm")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Dorm created", content = @Content)
    })
    DormDto postDorm(
            @Parameter(description = "Dorm to be saved")
            @RequestBody @Valid DormDto dorm
    );

    @PutMapping
    @Operation(summary = "Updates dorm")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Dorm updated", content = @Content),
            @ApiResponse(responseCode = "404", description = "Dorm with given UUID not found"),
    })
    DormDto putDorm(
            @RequestBody
            DormDto dorm
    );
}
