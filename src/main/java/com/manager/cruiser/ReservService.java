/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.cruiser;

import java.util.List;

/**
 *
 * @author alfar
 */
public interface ReservService {
    
    List<Reserv>Listar();
    Reserv listarId(int id);
    Reserv add(Reserv r);
    Reserv edit(Reserv r);
    Reserv delete(int id);
    
}
