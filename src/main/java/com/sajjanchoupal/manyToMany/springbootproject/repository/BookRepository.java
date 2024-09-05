package com.sajjanchoupal.manyToMany.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sajjanchoupal.manyToMany.springbootproject.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
