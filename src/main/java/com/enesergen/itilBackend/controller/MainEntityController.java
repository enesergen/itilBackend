package com.enesergen.itilBackend.controller;

import com.enesergen.itilBackend.dto.AddMainEntityRequestDto;
import com.enesergen.itilBackend.dto.AddMainEntityResponseDto;
import com.enesergen.itilBackend.service.MainEntityService;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/performance")
@AllArgsConstructor
public class MainEntityController {
    private final MainEntityService mainEntityService;
    @PostMapping("/add")
    public ResponseEntity<AddMainEntityResponseDto>addMainEntity(@RequestBody AddMainEntityRequestDto requestDto){
        return ResponseEntity.ok(mainEntityService.addMainEntity(requestDto));
    }
}
