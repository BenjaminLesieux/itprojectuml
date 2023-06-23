package com.efrei.uml.manager.sales;

import com.efrei.uml.course.Course;
import com.efrei.uml.entity.Client;

public class SalesManager implements ISalesManager {
    @Override
    public void deliverSession(Course course, Client client) {
        System.out.println("Session delivered to client " + client.getLastName() + ".");
        if (client.getCompany() != null) {
            System.out.println("Client " + client.getLastName() + " is from company " + client.getCompany() + ".");
        }
    }
}
