package com.example.exemple23.services;

import com.example.exemple23.dto.UserInDto;
import com.example.exemple23.dto.UserInNoteDto;
import com.example.exemple23.dto.UserOutDto;
import com.example.exemple23.dto.UserOutNoteDto;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

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
    public Float calculerMoyenne (List<Float> notes){

        float somme = 0;
        for (int i = 0; i < notes.size(); i++){
            somme = somme + notes.get(i);
        }
        return somme/ notes.size();
    }
    public UserOutNoteDto toDto(UserInNoteDto dto){
        // on recupere les valeurs
        UserOutNoteDto result = new UserOutNoteDto();
        result.setDisplay_name(dto.getPrenom() + " " + dto.getNom());
        result.setMoyenne(calculerMoyenne(dto.getNotes()));
        return result;
    }


}
