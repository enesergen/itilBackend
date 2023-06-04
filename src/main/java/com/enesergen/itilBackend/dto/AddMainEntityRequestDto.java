package com.enesergen.itilBackend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddMainEntityRequestDto {
    private int maintenanceTime;
    private int maintenanceTimeSeverity;

    private int interruptionTime;
    private int interruptionTimeSeverity;

    private int backUpTime;
    private int backUpTimeSeverity;

    private int monitoring;
    private int monitoringSeverity;

    private int responseTime;
    private int responseTimeSeverity;

    private int recoveryTime;
    private int recoveryTimeSeverity;

    private int networkUsage;
    private int networkUsageSeverity;

    private int memoryUsage;
    private int memoryUsageSeverity;

    private int cpuUsage;
    private int cpuUsageSeverity;

    private int diskUsage;
    private int diskUsageSeverity;

    @Override
    public String toString() {
        return "AddMainEntityRequestDto{" +
                "maintenanceTime=" + maintenanceTime +
                ", maintenanceTimeSeverity=" + maintenanceTimeSeverity +
                ", interruptionTime=" + interruptionTime +
                ", interruptionTimeSeverity=" + interruptionTimeSeverity +
                ", backUpTime=" + backUpTime +
                ", backUpTimeSeverity=" + backUpTimeSeverity +
                ", monitoring=" + monitoring +
                ", monitoringSeverity=" + monitoringSeverity +
                ", responseTime=" + responseTime +
                ", responseTimeSeverity=" + responseTimeSeverity +
                ", recoveryTime=" + recoveryTime +
                ", recoveryTimeSeverity=" + recoveryTimeSeverity +
                ", networkUsage=" + networkUsage +
                ", networkUsageSeverity=" + networkUsageSeverity +
                ", memoryUsage=" + memoryUsage +
                ", memoryUsageSeverity=" + memoryUsageSeverity +
                ", cpuUsage=" + cpuUsage +
                ", cpuUsageSeverity=" + cpuUsageSeverity +
                ", diskUsage=" + diskUsage +
                ", diskUsageSeverity=" + diskUsageSeverity +
                '}';
    }
}
