import Enums.Gender;
import db.DataBase;
import model.Group;
import model.Student;
import service.impl.GroupServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Student student = new Student("Adilet", 22, Gender.MALE);
        Group group = new Group(1, "Java-9", "Best", 2023);
        Group group1 = new Group(2, "Jav", "Best", 2021);
        Group group2 = new Group(3, "GH", "Best", 2019);
        Group group3 = new Group(4, "sfjk9", "Best", 2018);

        GroupServiceImpl groupService = new GroupServiceImpl();
        System.out.println(groupService.addNewGroup(group));
        System.out.println(groupService.addNewGroup(group1));
        System.out.println(groupService.addNewGroup(group2));
        System.out.println(groupService.addNewGroup(group3));

        System.out.println(groupService.getAllGroups());
        System.out.println(groupService.getGroupById(3));
        System.out.println(groupService.filterByYear(2, "A"));
        System.out.println(groupService.sortGroupByYear("A"));
    }
}