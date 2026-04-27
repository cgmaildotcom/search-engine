package searchengine.secgmaildotcom.mapping;

import searchengine.secgmaildotcom.dto.PersonalityResponse;
import searchengine.secgmaildotcom.entity.PersonalityEntity;

public class PersonalityMapper {
    
    public PersonalityResponse createPersonalityResponse(PersonalityEntity personalityEntity) {
        return new PersonalityResponse(
            personalityEntity.getName(),
            personalityEntity.getEducation(),
            personalityEntity.getSpouse(),
            personalityEntity.getChildren(),
            personalityEntity.getDateOfBirth(),
            personalityEntity.getDateOfDeath()
        );
    }

}
