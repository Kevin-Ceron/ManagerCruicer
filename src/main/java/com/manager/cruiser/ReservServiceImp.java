package com.manager.cruiser;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfar
 */
@Service
public class ReservServiceImp implements ReservService{
    @Autowired
    private ReservRepository repository;

    @Override
    public List<Reserv> Listar() {
        return repository.findAll();
    }

    @Override
    public Reserv listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reserv add(Reserv r) {
        return repository.save(r);
    }

    @Override
    public Reserv edit(Reserv r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reserv delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
