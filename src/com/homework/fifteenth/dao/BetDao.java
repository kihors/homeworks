package com.homework.fifteenth.dao;


import com.homework.fifteenth.model.Bet;

import java.util.List;

//НАШ КЛАСС ДЛЯ РАБОТЫ С БАЗОЙ ДАННЫХ И ТАБЛИЦОЙ СТАВОК
public interface BetDao {

    void add(Bet bet);
    List<Bet> getAll();


}