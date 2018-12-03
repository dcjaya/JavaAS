/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import POJOs.Employees;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Chami
 */
public class Employee {

    public boolean saveEmploye(String initials, String fullname, String contactno, String designation) {
        try {
            
            Session s = Connection.Controler.getSessionFactory().openSession();
            Criteria c = (Criteria) s.createCriteria(POJOs.Employees.class)
                    .add(Restrictions.eq("contactNo", Integer.parseInt(contactno)));
            List li = c.list();
            
            if(li.size() == 0){
                
            POJOs.Employees employees = new Employees();
            
            employees.setInitials(initials);
            employees.setFullName(fullname);
            employees.setContactNo(Integer.parseInt(contactno));
            employees.setDesignation(designation);
            
            s.save(employees);
            s.beginTransaction().commit();
            s.close();
            
            return true;
            
            }else{
            return false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
 }
    
}
