package com.group.manager;

import com.group.dto.request.RegisterRequestDto;
import com.group.dto.request.UpdateMailRequestDto;
import com.group.dto.request.UpdatePasswordRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.group.constants.EndPoints.*;

@FeignClient(url = "http://localhost:9090/api/v1/auth",decode404 = true,name = "companyadmin-auth")

public interface IAuthManager {

    @PostMapping(SAVE)
    public ResponseEntity<Long> register(@RequestBody RegisterRequestDto dto);

    @PostMapping(DEACTIVATE+BYID)
    public ResponseEntity<Boolean> deactivateById(@PathVariable Long id);

    @DeleteMapping(DELETE+BYID)
    public ResponseEntity<Boolean> deleteByAuthId(@PathVariable Long id);
    @PostMapping(UPDATE+PASSWORD)
    public ResponseEntity<Boolean> updatePassword(@RequestBody UpdatePasswordRequestDto dto);
    @PostMapping(UPDATE+MAIL)
    public ResponseEntity<Boolean> updateMail(@RequestBody UpdateMailRequestDto dto);
}
