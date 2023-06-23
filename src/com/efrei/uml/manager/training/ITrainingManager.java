package com.efrei.uml.manager.training;

import com.efrei.uml.Website;
import com.efrei.uml.course.Course;
import com.efrei.uml.entity.Trainer;
import com.efrei.uml.manager.logistics.ILogisticManager;
import com.efrei.uml.session.Session;

public interface ITrainingManager {

    void addCourse(Website website, Course course);
    void removeCourse(Website website, Course course);
    void reprimandTrainer(Trainer trainer, ILogisticManager logisticManager, Session session);
    void confirmRegistration(Course course);
    void checkEvaluationMarks(Trainer trainer);
}
