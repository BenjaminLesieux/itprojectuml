package com.efrei.uml;

import com.efrei.uml.course.Course;
import com.efrei.uml.course.CourseFrequency;
import com.efrei.uml.entity.Client;
import com.efrei.uml.manager.logistics.ILogisticManager;
import com.efrei.uml.manager.logistics.LogisticManager;
import com.efrei.uml.manager.sales.ISalesManager;
import com.efrei.uml.manager.sales.SalesManager;
import com.efrei.uml.manager.training.ITrainingManager;
import com.efrei.uml.manager.training.TrainingManager;
import com.efrei.uml.session.PersonalizedSession;
import com.efrei.uml.session.SessionBuilder;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Website {
    private static Website instance; // Singleton instance

    private List<Course> catalog;
    private ISalesManager salesManager;
    private ILogisticManager logisticManager;
    private ITrainingManager trainingManager;

    private List<Client> clients;

    private Website() {
        this.catalog = List.of();
        this.salesManager = new SalesManager();
        this.logisticManager = new LogisticManager();
        this.trainingManager = new TrainingManager();
    }

    public static Website getInstance() {
        if (instance == null) {
            synchronized (Website.class) {
                if (instance == null) {
                    instance = new Website();
                }
            }
        }
        return instance;
    }

    public List<Course> getCatalog() {
        return catalog;
    }

    public ISalesManager getSalesManager() {
        return salesManager;
    }

    public ILogisticManager getLogisticManager() {
        return logisticManager;
    }

    public ITrainingManager getTrainingManager() {
        return trainingManager;
    }

    public List<Client> getClients() {
        return clients;
    }
}
