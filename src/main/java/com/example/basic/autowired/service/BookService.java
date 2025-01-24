package com.example.basic.autowired.service;


import com.example.basic.autowired.dao.BookDao;
import com.example.basic.autowired.dao.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void saleBook(BookEntity book){
        bookDao.addBook(book);
    }

    public List<BookEntity> listAllBook(){
        return bookDao.getList();
    }



}
