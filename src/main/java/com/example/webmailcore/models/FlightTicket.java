package com.example.webmailcore.models;


import com.example.webmailcore.enums.TicketStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "FLIGHT_TICKET")
@AllArgsConstructor
@NoArgsConstructor
public class FlightTicket extends AbstractEntity implements Serializable {

    @Column(name = "PASSENGER_FIRSTNAME")
    private String passengerFirstname;

    @Column(name = "PASSENGER_LASTNAME")
    private String passengerLastname;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "AIRPLANE_COMPANY_ID")
    private AirplaneCompany airplaneCompany;

    @Column(name = "FLIGHT_NUMBER")
    private String flightNumber;

    @Column(name = "SEAT")
    private String seat;

    @Column(name = "GATE")
    private String gate;

    @Column(name = "STATUS")
    private TicketStatus status;

    @Column(name = "DEPARTURE_DATE")
    private Date departureDate;

    @Column(name = "BOARDING_HOUR")
        private String boardingHour;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_FROM")
    private Country countryFrom;

    @ManyToOne
    @JoinColumn(name = "CITY_FROM")
    private City cityFrom;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_TO")
    private Country countryTo;

    @ManyToOne
    @JoinColumn(name = "CITY_TO")
    private City cityTo;

    @Column(name = "AIRPORT")
    private String airport;

    @Column(name = "PRICE")
    private Double price;

}