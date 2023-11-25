package com.beratyesbek.discountservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "external_id")
    private String externalId;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Discount> discounts;

}
