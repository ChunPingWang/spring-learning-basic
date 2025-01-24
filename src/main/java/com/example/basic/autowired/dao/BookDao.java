package com.example.basic.autowired.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDao {
    private BookEntity book;
    private final List<BookEntity> list = new ArrayList<>();

    public void addBook(BookEntity book){
       this.list.add(book);
    }

    public List<BookEntity> getList() {
        return list;
    }

}
