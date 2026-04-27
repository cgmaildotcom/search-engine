package searchengine.secgmaildotcom.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import searchengine.secgmaildotcom.entity.PersonalityEntity;

@Repository
public interface PersonalityRepository extends JpaRepository <PersonalityEntity, Long> {  

    public Page<PersonalityEntity> findAll(Pageable pageable);

    public List<PersonalityEntity> findAllById(Collection<Long> ids);

} 
