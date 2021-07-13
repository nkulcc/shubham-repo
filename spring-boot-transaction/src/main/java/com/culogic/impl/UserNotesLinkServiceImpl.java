package com.culogic.impl;

import com.culogic.modal.Notes;
import com.culogic.modal.User;
import com.culogic.service.NotesService;
import com.culogic.service.UserNotesLinkService;
import com.culogic.service.UserService;
import com.culogic.util.ApplicationConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class UserNotesLinkServiceImpl implements UserNotesLinkService {
    @Autowired
    private UserService userService;

    @Autowired
    private NotesService notesService;

    @Override
    @Transactional
    public String addNoteToSpecificUser(User user, Notes note) throws Exception {
        //create new user
        User createdUser = userService.registerUser(user);
        Notes dbNote = new Notes();
        dbNote.setTitle(note.getTitle());
        dbNote.setMessage(note.getMessage());
        //set created user to note
        dbNote.setUserDetails(createdUser);
        //persist new note
        notesService.addNote(dbNote);
        return ApplicationConstants.ADDED_NOTE_DESC;
    }
}
