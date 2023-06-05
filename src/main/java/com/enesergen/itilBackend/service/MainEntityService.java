package com.enesergen.itilBackend.service;

import com.enesergen.itilBackend.constant.Constant;
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

    public MainEntity dtoToObject(AddMainEntityRequestDto requestDto) {
        return MainEntity.builder()
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
    }
    public String responseTimeReport(int value){
        if(value==100){
            return Constant.RESPONSE_100;
        } else if (value==85) {
            return Constant.RESPONSE_85;
        }else if(value==70){
            return Constant.RESPONSE_70;
        } else if (value==30) {
            return Constant.RESPONSE_30;
        }else{
            throw new  Error("Invalid Value");
        }
    }
    public String maintenanceTimeReport(int value){
        if(value==100){
            return Constant.MAINTENANCE_100;
        } else if (value==80) {
            return Constant.MAINTENANCE_80;
        }else if(value==60){
            return Constant.MAINTENANCE_60;
        } else if (value==30) {
            return Constant.MAINTENANCE_30;
        }else{
            throw new  Error("Invalid Value");
        }
    }
    public AddMainEntityResponseDto addMainEntity(AddMainEntityRequestDto requestDto) {
        var entityObj = dtoToObject(requestDto);
        mainEntityRepository.save(entityObj);
        return new AddMainEntityResponseDto("Successfull");
    }
}
