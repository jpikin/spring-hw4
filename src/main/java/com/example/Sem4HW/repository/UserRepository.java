package com.example.Sem4HW.repository;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Getter
@Repository
public class UserRepository {


    private List<String> queue = new ArrayList<>();


    public void addToQueue(String s){
        if (s == null) s = "";
        if(!s.isEmpty())
            queue.add(0, s);

    }
    public String removeFromQueue(){
        if(!queue.isEmpty()) {
            String s = queue.get(queue.size() - 1);
            queue.remove(queue.size() - 1);
            return s;
        }
        return "";
    }
}
