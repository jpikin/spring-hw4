package com.example.Sem4HW.service;

import com.example.Sem4HW.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    private UserRepository repository;

    public void addToQueue(String s){
        repository.addToQueue(s);
    }
    public void removeFromQueue(){
        repository.removeFromQueue();
    }
    public List<String> getQueue(){
        return repository.getQueue();
    }
}
