package com.meetingplanner.dto;

import com.meetingplanner.entities.Locale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalleDto {
    Long Id;
    String name;
    int capaciter;
    int capacityInCovid;
    List<EquipmentDto> equipment;
    Locale locale;
    List<ReservationDto> reservations;
}
