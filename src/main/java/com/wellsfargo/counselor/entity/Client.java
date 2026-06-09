package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @ManyToOne
    private Advisor advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    protected Client() {
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public long getClientId() {
        return clientId;
    }

    public Client(String firstName, String lastName,
                  String email, String phone,
                  Advisor advisor, Portfolio portfolio) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.advisor = advisor;
        this.portfolio = portfolio;
    }

    // getter for clientId

    // getters and setters for all other fields
}
