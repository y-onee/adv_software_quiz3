package main.java;

import java.util.HashMap;
import java.util.Map;

public class UserDB {
    public String getUser(){
        String userName = "member1";
        return userName;
    };

    public String getTask(){
        String task = "task1";
        return task;
    }

    public boolean assignTo(String member){
        Map<String, String> taskList = new HashMap<String, String>();
        taskList.put(getUser(), getTask());
        if(taskList.isEmpty()) {
            return false;
        };
        return true;
    }


}
