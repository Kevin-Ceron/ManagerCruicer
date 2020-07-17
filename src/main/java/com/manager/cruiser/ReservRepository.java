/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.cruiser;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author alfar
 */
public interface ReservRepository extends Repository<Reserv, Integer>{
    List<Reserv>findAll();
    Reserv findById(int id);
    Reserv save(Reserv r);
    void delete(Reserv r);
}
