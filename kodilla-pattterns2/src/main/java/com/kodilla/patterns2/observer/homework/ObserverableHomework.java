package com.kodilla.patterns2.observer.homework;

public interface ObserverableHomework {
    void addHomework(ObserverHomeWork homeWork);
    void notifyHomework();
    void removeHomework(ObserverHomeWork homeWork);

}
