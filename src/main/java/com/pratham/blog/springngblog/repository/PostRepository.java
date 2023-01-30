package com.pratham.blog.springngblog.repository;

import com.pratham.blog.springngblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
