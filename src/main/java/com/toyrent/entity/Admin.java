package com.toyrent.entity;

import lombok.*;
import org.hibernate.annotations.Generated;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.math.BigInteger;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    @Email
    private String emailId;
   // @Size(min = 10 , max = 10, message = "Invalid contact number please enter 10 digit number")
   @Min(value = 10, message = "Invalid contact number please enter 10 digit number")
   @Max(value = 10, message = "Invalid contact number please enter 10 digit number")
    private Long contactNo;
    @NotBlank(message = "Password should not be null or blank")
    @NotNull(message = "Password should not be null or blank")
    @Size(min = 6, max = 8,  message = "invalid password!! Try again.")
    private String password;
}
