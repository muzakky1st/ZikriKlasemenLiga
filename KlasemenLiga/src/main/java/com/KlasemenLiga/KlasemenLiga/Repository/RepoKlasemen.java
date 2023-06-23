package com.KlasemenLiga.KlasemenLiga.Repository;

import com.KlasemenLiga.KlasemenLiga.Entity.EntityKlasemen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoKlasemen  extends JpaRepository<EntityKlasemen, Long> {
}
