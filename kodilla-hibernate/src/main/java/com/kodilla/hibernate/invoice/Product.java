package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    //    @ManyToOne
//    @JoinColumn(name="ID")
//    public Item getItems() {
//        return new List<Item>items;
//    }

//    public void setItems () {
//        this.items = items;
//    }
}



//@Entity
//@Table(name = "PRODUCTS")
//public class Product {
//    private int id;
//    private String name;
//    private Item item;
//    private List<Item> items = new ArrayList<>();
//
//    public Product() {
//    }
//
//    public Product(String name) {
//        this.name = name;
//    }
//
//    @Id
//    @NotNull
//    @GeneratedValue
//    @Column(name = "ID", unique = true)
//    public int getId() {
//        return id;
//    }
//
//    @NotNull
//    @Column(name = "PRODUCTNAME")
//    public String getName() {
//        return name;
//    }
//
//    @OneToMany(
//            targetEntity = Item.class,
//           mappedBy = "product",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY
//    )
//    public List<Item> getItem() {
//        return items;
//    }
//
//
//    public Item getItem() {
//        return item;
//    }
//
//    public List<Item> getItems() {
//        return items;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }
//}
