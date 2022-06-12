package com.farukkavlak.hw2.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Table(name = "CountryTable")
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    @Id
    @SequenceGenerator(name = "Country",sequenceName = "country_id_seq")
    @GeneratedValue(generator = "Country")
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer countryCode;

    public Country(int countryCode, String countryName) {
        this.countryCode = countryCode;
        this.name = countryName;
    }
}
