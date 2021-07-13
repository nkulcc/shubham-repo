package com.culogic.service;

import org.springframework.stereotype.Service;

import com.culogic.modal.Notes;
import com.culogic.modal.User;

@Service
public interface UserNotesLinkService {
    public String addNoteToSpecificUser(User user, Notes note) throws Exception;
}
