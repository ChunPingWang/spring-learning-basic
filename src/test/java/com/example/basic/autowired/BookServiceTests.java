package com.example.basic.autowired;

import com.example.basic.autowired.dao.BookEntity;
import com.example.basic.autowired.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTests {

    @Autowired
    BookService bookService;

    @Test
    public void sale_a_book_test(){
        String title = "C Compiler";
        BookEntity cCompilerBook = new BookEntity();
        cCompilerBook.setTitle(title);
        bookService.saleBook(cCompilerBook);

        Assertions.assertEquals(title, bookService.listAllBook().get(0).getTitle());
    }
}
