//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Iterator;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//
//    @Autowired
//    InvoiceDao invoiceDao;
//
//    @Test
//    void testInvoiceDaoSave() {
//
//        //Given
//        Product product1 = new Product("X");
//        Product product2 = new Product("Y");
//
//        Item item1 = new Item();
//        Item item2 = new Item();
//
//        product1.getItems().add(item1);
//        product2.getItems().add(item2);
//
//        Invoice invoice1 = new Invoice("One");
//        invoice1.getItems().add(item1);
//
//        Invoice invoice2 = new Invoice("Two");
//        invoice2.getItems().add(item2);
//
//        //When
//        invoiceDao.save(invoice1);
//        invoiceDao.save(invoice2);
//
//        int id = invoice1.getId();
//        int id2 = invoice2.getId();
//
//        //Then
//        Assert.assertNotEquals(0, id);
//        Assert.assertNotEquals(0, id2);
//
//        assertEquals(invoice1.getId(), id);
//        assertEquals(invoice2.getId(), id2);
//
//        //CleanUp
//        try {
//            invoiceDao.deleteById(id);
//            invoiceDao.deleteById(id2);
//        } catch (Exception e) {
//            //do nothing
//        }
//    }
//}
