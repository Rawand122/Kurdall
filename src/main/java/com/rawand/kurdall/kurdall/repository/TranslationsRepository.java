package com.rawand.kurdall.kurdall.repository;

import com.rawand.kurdall.kurdall.entity.Translations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationsRepository extends CrudRepository<Translations, Long> {
}
