package com.enesergen.itilBackend.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddMainEntityResponseDto {
    private String report;
    private List<CircleChart> circleChartList;
    private int totalPoint;
}
