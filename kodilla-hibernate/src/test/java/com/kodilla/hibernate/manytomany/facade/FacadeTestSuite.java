package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.query.Param;
import org.springframework.util.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FacadeTestSuite {

    @Autowired
    Facade facade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void facadeEmployeeSearchingTest() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        facade.saveEmployee(johnSmith);
        facade.saveEmployee(stephanieClarkson);
        facade.saveEmployee(lindaKovalsky);

        //When
        List<Employee>employees=facade.findByPartOfName("Smi");
        System.out.println(employees);
        System.out.println();
        int size = employees.size();

        //Then
        assertNotEquals(1,size);
        //CleanUp
        facade.removeEmployee(johnSmith);
        facade.removeEmployee(stephanieClarkson);
        facade.removeEmployee(lindaKovalsky);
    }

    @Test
    public void FacadeCompanySearchingTest(){
        //Given
        Company softwareMachine = new Company("Software Machine");

        facade.saveCompany(softwareMachine);

        //When
        List<Company>companies=facade.findByPartOfCompName("Soft");
        System.out.println(companies);
        System.out.println();
        int size= companies.size();

        //Then
        assertNotEquals(1,size);
        //CleanUp
        facade.removeCompany(softwareMachine);

    }
}
