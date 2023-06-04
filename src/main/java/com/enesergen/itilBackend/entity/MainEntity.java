package com.enesergen.itilBackend.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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




}
