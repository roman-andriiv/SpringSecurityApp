package com.example.andriiv.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * @author Roman_Andriiv
 */
@Service
public class AdminService {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void doAdminStuff(){
        System.out.println("Only admin here");
    }
}
