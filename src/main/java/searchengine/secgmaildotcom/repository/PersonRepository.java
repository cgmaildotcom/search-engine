package searchengine.secgmaildotcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import searchengine.secgmaildotcom.entity.PersonalityEntity;

public interface PersonRepository extends JpaRepository <PersonalityEntity, Long> {  
} 
