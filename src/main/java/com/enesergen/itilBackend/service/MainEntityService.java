package com.enesergen.itilBackend.service;

import com.enesergen.itilBackend.constant.Constant;
import com.enesergen.itilBackend.dto.AddMainEntityRequestDto;
import com.enesergen.itilBackend.dto.AddMainEntityResponseDto;
import com.enesergen.itilBackend.dto.CircleChart;
import com.enesergen.itilBackend.entity.MainEntity;
import com.enesergen.itilBackend.repository.MainEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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

    public String responseTimeReport(int value) {
        if (value == 100) {
            return Constant.RESPONSE_100;
        } else if (value == 85) {
            return Constant.RESPONSE_85;
        } else if (value == 70) {
            return Constant.RESPONSE_70;
        } else if (value == 30) {
            return Constant.RESPONSE_30;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public String maintenanceTimeReport(int value) {
        if (value == 100) {
            return Constant.MAINTENANCE_100;
        } else if (value == 80) {
            return Constant.MAINTENANCE_80;
        } else if (value == 60) {
            return Constant.MAINTENANCE_60;
        } else if (value == 30) {
            return Constant.MAINTENANCE_30;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public String interruptionTimeReport(int value) {
        if (value == 100) {
            return Constant.INTERRUPTION_100;
        } else if (value == 90) {
            return Constant.INTERRUPTION_90;
        } else if (value == 80) {
            return Constant.INTERRUPTION_80;
        } else if (value == 60) {
            return Constant.INTERRUPTION_60;
        } else if (value == 40) {
            return Constant.INTERRUPTION_40;
        } else if (value == 20) {
            return Constant.INTERRUPTION_20;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public String backUpTimeReport(int value) {
        if (value == 100) {
            return Constant.BACKUP_100;
        } else if (value == 85) {
            return Constant.BACKUP_85;
        } else if (value == 70) {
            return Constant.BACKUP_70;
        } else if (value == 50) {
            return Constant.BACKUP_50;
        } else if (value == 30) {
            return Constant.BACKUP_30;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public String recoveryTimeReport(int value) {
        if (value == 100) {
            return Constant.RECOVERY_100;
        } else if (value == 85) {
            return Constant.RECOVERY_85;
        } else if (value == 70) {
            return Constant.RECOVERY_70;
        } else if (value == 60) {
            return Constant.RECOVERY_60;
        } else if (value == 50) {
            return Constant.RECOVERY_50;
        } else if (value == 20) {
            return Constant.RECOVERY_20;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public String monitoringReport(int value) {
        if (value == 100) {
            return Constant.MONITORING_100;
        } else if (value == 0) {
            return Constant.MONITORING_0;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public String memoryUsageReport(int value) {
        if (value == 100) {
            return Constant.MEMORY_100;
        } else if (value == 85) {
            return Constant.MEMORY_85;
        } else if (value == 70) {
            return Constant.MEMORY_70;
        } else if (value == 50) {
            return Constant.MEMORY_50;
        } else if (value == 20) {
            return Constant.MEMORY_20;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public String networkUsageReport(int value) {
        if (value == 100) {
            return Constant.NETWORK_100;
        } else if (value == 90) {
            return Constant.NETWORK_90;
        } else if (value == 80) {
            return Constant.NETWORK_80;
        } else if (value == 40) {
            return Constant.NETWORK_40;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public String cpuUsageReport(int value) {
        if (value == 100) {
            return Constant.CPU_100;
        } else if (value == 85) {
            return Constant.CPU_85;
        } else if (value == 70) {
            return Constant.CPU_70;
        } else if (value == 40) {
            return Constant.CPU_40;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public String diskUsageReport(int value) {
        if (value == 100) {
            return Constant.DISK_100;
        } else if (value == 85) {
            return Constant.DISK_85;
        } else if (value == 60) {
            return Constant.DISK_60;
        } else if (value == 30) {
            return Constant.DISK_30;
        } else {
            throw new Error("Invalid Value");
        }
    }

    public List<String> report(AddMainEntityRequestDto requestDto) {
        return new ArrayList<String>(List.of(
                Constant.ENTRY,
                responseTimeReport(requestDto.getResponseTime()),
                maintenanceTimeReport(requestDto.getMaintenanceTime()),
                interruptionTimeReport(requestDto.getInterruptionTime()),
                backUpTimeReport(requestDto.getBackUpTime()),
                recoveryTimeReport(requestDto.getRecoveryTime()),
                monitoringReport(requestDto.getMonitoring()),
                memoryUsageReport(requestDto.getMemoryUsage()),
                networkUsageReport(requestDto.getNetworkUsage()),
                cpuUsageReport(requestDto.getCpuUsage()),
                diskUsageReport(requestDto.getDiskUsage()),
                Constant.CONCLUSION
            )
        );


    }

    public List<CircleChart> circleChartList(AddMainEntityRequestDto requestDto) {
        var responseTimePoint = requestDto.getResponseTime() * requestDto.getResponseTimeSeverity();
        var maintenanceTimePoint = requestDto.getMaintenanceTime() * requestDto.getMaintenanceTimeSeverity();
        var interruptionTimePoint = requestDto.getInterruptionTime() * requestDto.getInterruptionTimeSeverity();
        var backUpTimePoint = requestDto.getBackUpTime() * requestDto.getBackUpTimeSeverity();
        var recoveryTimePoint = requestDto.getRecoveryTime() * requestDto.getRecoveryTimeSeverity();
        var monitoringPoint = requestDto.getMonitoring() * requestDto.getMonitoringSeverity();
        var networkUsagePoint = requestDto.getNetworkUsage() * requestDto.getNetworkUsageSeverity();
        var memoryUsagePoint = requestDto.getMemoryUsage() * requestDto.getMemoryUsageSeverity();
        var cpuUsagePoint = requestDto.getCpuUsage() * requestDto.getCpuUsageSeverity();
        var diskUsagePoint = requestDto.getDiskUsage() * requestDto.getDiskUsageSeverity();
        var totalPoint = responseTimePoint + maintenanceTimePoint + interruptionTimePoint + backUpTimePoint + recoveryTimePoint + monitoringPoint + networkUsagePoint + memoryUsagePoint + cpuUsagePoint + diskUsagePoint;
        List<CircleChart> circleChartList = new ArrayList<>();
        circleChartList.add(new CircleChart("Response Time", responseTimePoint, (float) responseTimePoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        circleChartList.add(new CircleChart("Maintenance Time", maintenanceTimePoint, (float) maintenanceTimePoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        circleChartList.add(new CircleChart("Interruption Time", interruptionTimePoint, (float) interruptionTimePoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        circleChartList.add(new CircleChart("Back Up Time", backUpTimePoint, (float) backUpTimePoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        circleChartList.add(new CircleChart("Recovery Time", recoveryTimePoint, (float) recoveryTimePoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        circleChartList.add(new CircleChart("Monitoring", monitoringPoint, (float) monitoringPoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        circleChartList.add(new CircleChart("Network Usage", networkUsagePoint, (float) networkUsagePoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        circleChartList.add(new CircleChart("Memory Usage", memoryUsagePoint, (float) memoryUsagePoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        circleChartList.add(new CircleChart("CPU Usage", cpuUsagePoint, (float) cpuUsagePoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        circleChartList.add(new CircleChart("Disk Usage", diskUsagePoint, (float) diskUsagePoint / totalPoint * 100, new StringBuilder().append("%").append((float) responseTimePoint / totalPoint * 100).toString()));
        return circleChartList;
    }

    public int calculateTotalPoint(List<CircleChart> circleChartList) {
        AtomicInteger sum = new AtomicInteger();
        circleChartList.forEach(item -> {
            sum.addAndGet(item.getPoint());
        });
        return sum.get();
    }

    public AddMainEntityResponseDto addMainEntity(AddMainEntityRequestDto requestDto) {
        var entityObj = dtoToObject(requestDto);
        mainEntityRepository.save(entityObj);
        System.out.println(report(requestDto));
        return new AddMainEntityResponseDto(report(requestDto), circleChartList(requestDto), calculateTotalPoint(circleChartList(requestDto)));
    }
}
