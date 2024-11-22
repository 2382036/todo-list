module todoApp {
    requires spring.context;
    requires spring.beans;
    requires java.sql;
    requires jdk.compiler;

    opens todoApp;
    opens todoApp.entities;
    opens todoApp.repositories;
    opens todoApp.services;
    opens todoApp.views;
    opens todoApp.config;
}