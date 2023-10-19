package com.SHRAVAN.HotelManagement.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Guest guest;
    @ManyToOne(cascade = CascadeType.ALL)
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;
}
