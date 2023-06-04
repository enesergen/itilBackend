package com.enesergen.itilBackend.service;

import com.enesergen.itilBackend.dto.AddMainEntityRequestDto;
import com.enesergen.itilBackend.dto.AddMainEntityResponseDto;
import com.enesergen.itilBackend.entity.MainEntity;
import com.enesergen.itilBackend.repository.MainEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainEntityService {
    private final MainEntityRepository mainEntityRepository;
public AddMainEntityResponseDto addMainEntity(AddMainEntityRequestDto requestDto){

    var entityObj= MainEntity.builder()
            .responseTime(requestDto.getResponseTime())
            .responseTimeSeverity(requestDto.getResponseTimeSeverity())
            .maintenanceTime(requestDto.getMaintenanceTime())
            .maintenanceTimeSeverity(requestDto.getMaintenanceTimeSeverity())
            .interruptionTime(requestDto.getInterruptionTime())
            .interruptionTimeSeverity(requestDto.getInterruptionTimeSeverity())
            .backUpTime(requestDto.getBackUpTime())
            .backUpTimeSeverity(requestDto.getBackUpTimeSeverity())
            .recoveryTime(requestDto.getRecoveryTime())
            .recoveryTimeSeverity(requestDto.getRecoveryTimeSeverity())
            .monitoring(requestDto.getMonitoring())
            .monitoringSeverity(requestDto.getMonitoringSeverity())
            .networkUsage(requestDto.getNetworkUsage())
            .networkUsageSeverity(requestDto.getNetworkUsageSeverity())
            .memoryUsage(requestDto.getMemoryUsage())
            .memoryUsageSeverity(requestDto.getMemoryUsageSeverity())
            .cpuUsage(requestDto.getCpuUsage())
            .cpuUsageSeverity(requestDto.getCpuUsageSeverity())
            .diskUsage(requestDto.getDiskUsage())
            .diskUsageSeverity(requestDto.getDiskUsageSeverity())
            .build();
            mainEntityRepository.save(entityObj);
    System.out.println(requestDto.toString());
    return new AddMainEntityResponseDto("Successfull");
}
}
