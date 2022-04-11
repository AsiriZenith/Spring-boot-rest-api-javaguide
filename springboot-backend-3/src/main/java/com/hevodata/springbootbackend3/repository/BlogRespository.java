package com.hevodata.springbootbackend3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hevodata.springbootbackend3.Entity.Blog;
@Repository
public interface BlogRespository extends JpaRepository<Blog, Integer>{

	// custom query to search to blog post by title or content
    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);    
}
