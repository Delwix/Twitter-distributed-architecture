package com.twitter.blockservice.blockservice.repository;

import com.twitter.blockservice.blockservice.entity.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlockRepository extends JpaRepository<Block, Long> {

    List<String> fetchBlockers(@Param("blockee") final String blockee);
}
