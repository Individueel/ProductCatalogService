package com.hoef.mike.productcatalogservice.Entities;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatchDto {
    String op;
    String key;
    Set<String> value;
}