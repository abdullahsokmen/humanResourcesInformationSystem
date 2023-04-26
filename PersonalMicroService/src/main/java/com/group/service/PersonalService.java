package com.group.service;

import com.group.dto.request.PersonalSaveRequestDto;
import com.group.repository.IPersonalRepository;
import com.group.repository.entity.Personal;
import com.group.utility.ServiceManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonalService extends ServiceManager<Personal,Long> {
    private final IPersonalRepository personalService;

    public PersonalService(IPersonalRepository personalService) {
        super(personalService);
        this.personalService = personalService;
    }

    public Boolean createPersonal(PersonalSaveRequestDto dto) {

    }
}
