package com.articulo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.articulo.model.Post;

public interface  PostDAO extends JpaRepository<Post,Integer> {

}
