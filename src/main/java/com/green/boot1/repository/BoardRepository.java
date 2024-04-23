package com.green.boot1.repository;

import com.green.boot1.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board, Long> {

    @Query(value = "select now()")
    String getTime();


}
