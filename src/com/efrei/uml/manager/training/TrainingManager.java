package com.efrei.uml.manager.training;

import com.efrei.uml.Website;
import com.efrei.uml.course.Course;
import com.efrei.uml.entity.Client;
import com.efrei.uml.entity.Trainer;
import com.efrei.uml.manager.logistics.ILogisticManager;
import com.efrei.uml.session.Session;

public class TrainingManager implements ITrainingManager {
    @Override
    public void addCourse(Website website, Course course) {
        website.getCatalog().add(course);
    }

    @Override
    public void removeCourse(Website website, Course course) {
        website.getCatalog().remove(course);
    }

    @Override
    public void reprimandTrainer(Trainer trainer, ILogisticManager logisticManager, Session session) {
        System.out.println("Trainer " + trainer.getLastName() + " has been reprimanded.");
        logisticManager.notifyActors(session);
    }

    @Override
    public void confirmRegistration(Course course, Client client) {
        System.out.println("Registration for course " + course.toString() + " has been confirmed.");
        System.out.println("Client " + client.getLastName() + " has been notified.");
    }

    @Override
    public void checkEvaluationMarks(Trainer trainer) {
        if (trainer.getAvgEvaluationGrade() < 3) {
            System.out.println("Trainer " + trainer.getLastName() + " has been reprimanded.");
        } else {
            System.out.println("Trainer " + trainer.getLastName() + " has been congratulated.");
        }
    }
}
