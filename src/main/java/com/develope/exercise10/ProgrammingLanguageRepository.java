package com.develope.exercise10;

import com.develope.exercise10.model.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "repo-prog-languages")
@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
