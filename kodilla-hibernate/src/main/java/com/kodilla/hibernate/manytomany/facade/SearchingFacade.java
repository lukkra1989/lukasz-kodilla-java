package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private final static Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);


    public List<Company> findCompany(String field) throws FindingProcessException {
        List<Company> companies = companyDao.retrieveNameWhichThreeLettersEquals(field);

        if (companies.isEmpty()) {
            throw new FindingProcessException(FindingProcessException.ERR_NO_COM);
        }
        return companies;
    }

    public List<Employee> findEmployee(String field) throws FindingProcessException {
        List<Employee> employees = employeeDao.retrieveLastname(field);

        if (employees.isEmpty()) {
            throw new FindingProcessException(FindingProcessException.ERR_NO_EMP);

        }
        return employees;
    }
}
