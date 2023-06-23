package com.efrei.uml.course;

import java.util.List;

public enum SubTopic {

    JAVA(List.of(Topic.OBJECT_ORIENTED_PROGRAMMING, Topic.WEB_DEVELOPMENT)),
    PYTHON(List.of(Topic.BIG_DATA, Topic.OBJECT_ORIENTED_PROGRAMMING)),
    ATOMS(List.of(Topic.BIO_ENGINEERING)),
    FRENCH_REVOLUTION(List.of(Topic.FRENCH_HISTORY));

    private List<Topic> parentTopics;

    SubTopic(List<Topic> parentTopics) {
        this.parentTopics = parentTopics;
    }

    public List<Topic> getParentTopics() {
        return parentTopics;
    }
}
