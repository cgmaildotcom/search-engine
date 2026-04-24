package searchengine.secgmaildotcom.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import searchengine.secgmaildotcom.dto.PersonalityResponse;

@Repository
public interface PersonalityRepository extends JpaRepository <PersonalityResponse, Long> {  

    public List<PersonalityResponse> findAll();

    public List<PersonalityResponse> findAllById(Collection<Long> ids);

} 
