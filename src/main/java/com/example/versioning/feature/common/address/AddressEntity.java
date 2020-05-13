package com.example.versioning.feature.common.address;

import com.example.versioning.feature.common.account.AccountEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
public class AddressEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idaddress")
    private int id;
    @ManyToOne()
    @JoinColumn(name="idaccount", referencedColumnName = "idaccount", insertable = false, updatable = false)
    private AccountEntity account;
    private String postcode;
    private String street;
    private String extra;
    @Column(name = "housenumber")
    private short houseNumber;
    private String city;
    private String country;
    @Column(name = "postbusnumber")
    private String postBusNumber;
}
