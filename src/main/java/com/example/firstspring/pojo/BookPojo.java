package com.example.firstspring.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookPojo {
    private Integer id;
    @NotEmpty(message = "Date is required")
    private String bookDate;
    @NotEmpty(message = "Time is required")
    private String bookTime;
    @NotEmpty(message = "Booking Status is required")
    private String bookStatus;
    @NotNull(message = "Ground ID is required")
    private Integer ground_id;
    @NotNull(message = "User is required")
    private Integer user_id;


}
