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
public class Facade {
    private static final Logger LOGGER = LoggerFactory.getLogger(FindingProcessException.class);

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findByPartOfCompName(String companyName) {
        return companyDao.retrieveNameWhichThreeLettersEquals(companyName);
    }

    public List<Employee> findByPartOfName(String employeeName) {
        return employeeDao.retrieveLastname(employeeName);
    }

    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void saveCompany(Company company) {
        companyDao.save(company);
    }

    public void removeEmployee(Employee employee) {
        employeeDao.delete(employee);
    }

    public void removeCompany(Company company) {
        companyDao.delete(company);
    }

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }




//    public List<Company> findCompByString(String companyName) throws FindingProcessException {
//        List<Company> companiesList = companyDao.retrieveNameWhichThreeLettersEquals(companyName);
//        boolean wasError = false;
//        LOGGER.info("Searching a company bye its fragment name. ");
//        if (companiesList.size() <= 0) {
//            LOGGER.error(FindingProcessException.ERR_NO_COM);
//            wasError = true;
//            if (wasError)
//                LOGGER.info("ERROR ! NO SUCH COMPANY!");
//            throw new FindingProcessException(FindingProcessException.ERR_NO_COM);
//        }
//        return companiesList;
//        //return companyDao.retrieveNameWhichThreeLettersEquals(companyName);
//    }
//
//    public List<Employee> findEmpByString(String employeeName) throws FindingProcessException {
//        List<Employee> employeesList = employeeDao.retrieveLastname(employeeName);
//        boolean wasError = false;
//        LOGGER.info("Searching an Employee. ");
//        if (employeesList.size() <= 0) {
//            LOGGER.error(FindingProcessException.ERR_NO_EMP);
//            if (wasError)
//                LOGGER.info("ERROR ! NO SUCH EMPLOYEE!");
//            throw new FindingProcessException(FindingProcessException.ERR_NO_EMP);
//        }
//        //return employeesList;
//        return employeeDao.retrieveLastname(employeeName);
//    }
}
