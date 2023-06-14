package com.hoef.mike.productcatalogservice.Entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    private String name;

    private String description;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "categories", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Product> products = new HashSet<Product>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "category_parent", joinColumns = @JoinColumn(name = "ID"), inverseJoinColumns = @JoinColumn(name = "parent_id"))
    @JsonIgnoreProperties({ "subCategories", "parentCategories" })
    @JsonManagedReference
    private Set<Category> parentCategories = new HashSet<Category>();

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "parentCategories", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({ "subCategories", "parentCategories" })
    @JsonManagedReference
    private Set<Category> subCategories = new HashSet<Category>();
}