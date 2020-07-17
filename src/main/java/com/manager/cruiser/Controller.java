package com.manager.cruiser;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alfar
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/reserv"})
public class Controller {
    
    @Autowired
    ReservService serviceRs;
    
    
    @GetMapping("/listarRs")
    public List<Reserv>listarRv(){
        return serviceRs.Listar();
    } 
    
    @PostMapping("/agregar")
    public Reserv agregar(@RequestBody Reserv r){
        return serviceRs.add(r);
    } 
    
    
}
