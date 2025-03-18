package com.InventoryManagementSystems.Inventory.Management.System.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("QUANTITY")
    @Column(name = "QUANTITY")
    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;

    @JsonProperty("NAME")
    @Column(name = "NAME")
    @NotBlank(message = "Name cannot be empty")
    @Size(max = 50, message = "Name can be atmost 50 characters")
    private String name;

    @JsonProperty("DESCRIPTION")
    @Column(name = "DESCRIPTION")
    @NotBlank(message = "Description cannot be empty")
    private String description;
}

