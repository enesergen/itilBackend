package com.enesergen.itilBackend.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CircleChart {
    private String x;
    private int point;
    private float y;
    private String text;
}
