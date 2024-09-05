package com.sajjanchoupal.oneToOne.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sajjanchoupal.oneToOne.springbootproject.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
