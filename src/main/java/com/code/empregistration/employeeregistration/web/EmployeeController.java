package com.code.empregistration.employeeregistration.web;

import com.code.empregistration.employeeregistration.dao.EmployeeDao;
import com.code.empregistration.employeeregistration.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "EmployeeServlet", value = "/register")
public class EmployeeController extends HttpServlet {
    private EmployeeDao empDao;
    public void init (){
         empDao = new EmployeeDao();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String  fname =  req.getParameter("fname");
        String lname =  req.getParameter("lname");
        String uname = req.getParameter("uname");
        String passwd = req.getParameter("passwd");
        String address = req.getParameter("addr");
        String contact = req.getParameter("contact");

        Employee employee = new Employee();
        employee.setFirstName(fname);
        employee.setLastName(lname);
        employee.setUsername(uname);
        employee.setPassword(passwd);
        employee.setAddress(address);
        employee.setContact(contact);

        try{
            empDao.registerEmployee(employee);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
