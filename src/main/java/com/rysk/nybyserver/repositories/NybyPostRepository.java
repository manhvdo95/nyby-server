package com.rysk.nybyserver.repositories;

import com.rysk.nybyserver.models.dto.NybyPostDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NybyPostRepository extends JpaRepository<NybyPostDto, Long> {

}
