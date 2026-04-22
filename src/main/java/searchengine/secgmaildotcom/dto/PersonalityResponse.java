package searchengine.secgmaildotcom.dto;

import java.time.LocalDate;

public record PersonalityResponse(
    String name,
    String education,
    String spouse,
    String children,
    LocalDate dateOfBirth,
    LocalDate dateOfDeath
) {
}
