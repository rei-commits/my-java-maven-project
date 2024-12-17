package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.User;

public class CreateUserTable {
	   public static void main(String[] args) {
	       // Step 1: Create SessionFactory
	       SessionFactory factory = new Configuration().configure().buildSessionFactory();
	       
	       // Step 2: Open a Session
	       Session session = factory.openSession();
	       
	       // Step 3: Start Transaction
	       Transaction t = session.beginTransaction();
	       
	       // Step 4: Create a User object and set its values
	       User uone = new User();
	       
	       // Step 5: Commit the Transaction
	       t.commit();
	       System.out.println("successfully created user table");
	       
	       // Step 7: Close Session and Factory
	       session.close();
	       factory.close();
	   }
	}