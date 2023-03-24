package service.impl;

import db.DataBase;
import model.Group;
import service.GroupService;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class GroupServiceImpl implements GroupService {
    DataBase dataBase = new DataBase();

    @Override
    public String addNewGroup(Group group) {
        dataBase.getGroups().add(group);
        return "";
    }

    @Override
    public String getGroupById(long id) {
        dataBase.getGroups().stream().forEach(x -> System.out.println(x.getID()));
        return "";
    }

    @Override
    public List<Group> getAllGroups() {
        return dataBase.getGroups();
    }

    @Override
    public String updateGroupName(long id, String groupName) {
//        dataBase.getGroups().stream().forEach(x->x.getID()==id);
        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        dataBase.getGroups().stream().filter(x -> x.getYear() < year);
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
dataBase.getGroups().stream().sorted().collect(Collectors.toList());
        return null;
    }

    @Override
    public void deleteGroupById(long id) {

    }
}
