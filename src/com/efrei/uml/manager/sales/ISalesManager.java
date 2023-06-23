package com.efrei.uml.manager.sales;

import com.efrei.uml.course.Course;
import com.efrei.uml.entity.Client;

public interface ISalesManager {
    
    void deliverSession(Course course, Client client);
}
