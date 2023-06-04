package com.enesergen.itilBackend.repository;

import com.enesergen.itilBackend.entity.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainEntityRepository extends JpaRepository<MainEntity, Long> {
}
