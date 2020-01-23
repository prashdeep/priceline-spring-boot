package com.priceline.demo.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Builder
@Entity
@Table(name = "item")
public class Item implements Serializable, Comparable<Item> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "item_name", unique = true)
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "description cannot be blank")
    private String description;
    @Range(min = 20000, max = 40000, message = "Range should be between 20000 and 40000")
    private double price;

    @Override
    public int compareTo(Item item) {
        return (int)(this.id - item.id);
    }
}