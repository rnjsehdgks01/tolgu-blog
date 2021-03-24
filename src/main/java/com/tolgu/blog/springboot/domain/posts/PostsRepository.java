package com.tolgu.blog.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC") // 쿼리문 직접 추가 가능
    List<Posts> findAllDesc();
}
