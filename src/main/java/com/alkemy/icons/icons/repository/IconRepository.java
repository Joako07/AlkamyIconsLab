package com.alkemy.icons.icons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkemy.icons.icons.entity.IconEntity;

@Repository
public interface IconRepository extends JpaRepository<IconEntity, Long> {

}
