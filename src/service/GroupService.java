package service;

import model.Group;

import java.util.List;

public interface GroupService {
    String addNewGroup(Group group);
    String getGroupById(long id);

    List<Group> getAllGroups();

    String updateGroupName(long id, String groupName);

    //with stream (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<Group>filterByYear(int year, String ascDesc);

    //with stream  (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<Group>sortGroupByYear(String ascDesc);

    //with stream
    void deleteGroupById(long id);

}
