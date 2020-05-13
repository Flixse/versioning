package com.example.versioning.feature.common.account;

import com.example.versioning.feature.common.address.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "account")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idaccount")
    private Integer id;

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

    @OneToMany(targetEntity=AddressEntity.class, mappedBy="account",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AddressEntity> address = new ArrayList<>();
}
