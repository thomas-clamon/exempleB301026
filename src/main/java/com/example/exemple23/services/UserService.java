package com.example.exemple23.services;

import com.example.exemple23.dto.UserInDto;
import com.example.exemple23.dto.UserOutDto;

import java.time.LocalDate;
import java.time.Period;

public class UserService {

    public UserOutDto toOutDto (UserInDto dto){

        // on recupere les info
        UserOutDto result = new UserOutDto();
        result.setPrenom(dto.getPrenom());
        result.setNom(dto.getNom());

        // calcul de l'age
        Integer age = Period.between(dto.getDate_naissance(), LocalDate.now()).getYears();
        result.setAge(age);
        return result;
    }
}
