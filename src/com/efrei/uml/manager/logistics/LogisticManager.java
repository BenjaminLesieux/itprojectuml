package com.efrei.uml.manager.logistics;

import com.efrei.uml.course.Course;
import com.efrei.uml.entity.Trainer;
import com.efrei.uml.session.Session;

public class LogisticManager implements ILogisticManager {
    @Override
    public void cancelSession(Course course, Session session) {
        course.removeSession(session);
    }

    @Override
    public void addSession(Course course, Session session) {
        course.addSession(session);
    }

    @Override
    public void notifyActors(Session session) {
        System.out.println("Session " + session.getDate().toString() + " has been cancelled.");
        session.getTrainees().forEach(trainee -> System.out.println("Trainee " + trainee.getLastName() + " has been notified."));
        System.out.println("Trainer " + session.getTrainer().getLastName() + " has been notified.");
    }
}
