package com.sajjanchoupal.oneToMany.springboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sajjanchoupal.oneToMany.springboot.project.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
