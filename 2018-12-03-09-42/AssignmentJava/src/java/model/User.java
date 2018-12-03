/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import POJOs.Users;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Chami
 */
public class User {
    
    static User user;
    
    public static User getUser(){
    
        if(user == null){
        user = new User();
        return user;
        }
        return user;
    }

    public Users loginUser(String username, String password) {
        try {
            Session s = Connection.Controler.getSessionFactory().openSession();
            POJOs.Users user = (POJOs.Users) s.createCriteria(POJOs.Users.class)
                    .add(Restrictions.eq("role", username)).add(Restrictions.eq("password", password)).uniqueResult();
        
            if(user != null){
            return user;
            }else{
            return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
}
    
}
