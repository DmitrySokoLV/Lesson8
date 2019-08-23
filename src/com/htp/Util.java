package com.htp;

import java.util.Collection;
import java.util.Optional;


class Util {
    static Optional<Book> searchForSpecialBook(Collection<Book> listBook, int specialBook) {
        return listBook.stream().filter(b -> specialBook == b.getYearOfPublishing()).findAny();
    }
}