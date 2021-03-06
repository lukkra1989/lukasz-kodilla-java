package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Product product;
    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}


//@Entity
//@Table(name="ITEM")
//public class Item {
//
//    private int id;
//    private Product product;
//    private BigDecimal price;
//    private int quantity;
//    private BigDecimal value;
//
//    private Invoice invoice;
//
//    public Item() {
//    }
//
//    public Item( BigDecimal price, int quantity, BigDecimal value) {
//        this.price = price;
//        this.quantity = quantity;
//        this.value = value;
//    }
//
//    @Id
//    @NotNull
//    @GeneratedValue
//    @Column(name="ID",unique = true)
//    public int getId() {
//        return id;
//    }
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="PRODUCT_ID")
//    public Product getProduct() {
//        return product;
//    }
//
//    @Column(name="PRICE")
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    @Column(name="QUANTITY")
//    public int getQuantity() {
//        return quantity;
//    }
//
//    @Column(name="VALUE")
//    public BigDecimal getValue() {
//        return value;
//    }
//
//    private void setId(int id) {
//        this.id = id;
//    }
//
//    private void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    private void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    private void setValue(BigDecimal value) {
//        this.value = value;
//    }
//
//    @ManyToOne
//    @JoinColumn(name="INVOICE")
//    public Invoice getInvoice() {
//        return invoice;
//    }
//
//    public void setInvoice(Invoice invoice) {
//        this.invoice = invoice;
//    }
//}
