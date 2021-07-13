package com.culogic.service;

import org.springframework.stereotype.Service;

import com.culogic.modal.NoteBase;
import com.culogic.modal.User;

@Service
public interface UserService {
    public User registerUser(User user);
}