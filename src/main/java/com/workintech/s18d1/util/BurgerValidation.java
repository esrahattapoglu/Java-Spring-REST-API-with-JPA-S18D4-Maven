package com.workintech.s18d1.util;

import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {

    public static void checkBurger(Burger burger) {
        if (burger == null) {
            throw new BurgerException("Burger null olamaz!", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkId(long id) {
        if (id <= 0) {
            throw new BurgerException("Geçersiz id: " + id, HttpStatus.BAD_REQUEST);
        }
    }
}