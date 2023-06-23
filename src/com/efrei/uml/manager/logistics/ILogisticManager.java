package com.efrei.uml.manager.logistics;

import com.efrei.uml.course.Course;
import com.efrei.uml.entity.Trainer;
import com.efrei.uml.session.Session;

import java.util.Observable;

public interface ILogisticManager {
     void cancelSession(Course course, Session session);
     void addSession(Course course, Session session);
     void notifyActors(Session session);
}
