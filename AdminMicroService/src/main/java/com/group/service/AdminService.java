package com.group.service;

import com.group.dto.SaveRequestDto;
import com.group.mapper.IAdminMapper;
import com.group.repository.entity.Admin;
import com.group.repository.entity.IAdminRepository;
import com.group.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService extends ServiceManager<Admin,Long> {
    private final IAdminRepository adminRepository;

    public AdminService(IAdminRepository adminRepository) {
        super(adminRepository);
        this.adminRepository=adminRepository;
    }

    public Admin saveDto(SaveRequestDto dto) {
        Admin admin = IAdminMapper.INSTANCE.toAdmin(dto);
        return save(admin);
    }
}
