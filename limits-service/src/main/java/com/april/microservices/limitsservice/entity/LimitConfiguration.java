package com.april.microservices.limitsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LimitConfiguration {

    private int maximum;
    private int minimum;
}
