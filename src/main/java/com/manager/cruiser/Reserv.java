package com.manager.cruiser;

import javax.persistence.*;

/**
 *
 * @author alfar
 */

@Entity
@Table(name = "reservs")
public class Reserv {
    
    @Id
    @Column
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idreserv;
    @Column
    private String username;
    @Column
    private String userid;
    @Column
    private String roomid;
    @Column
    private int price;

    public int getIdreserv() {
        return idreserv;
    }

    public void setIdreserv(int idreserv) {
        this.idreserv = idreserv;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
   
    
}
