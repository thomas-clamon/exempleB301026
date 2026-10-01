package com.example.exemple23.controller;

import com.example.exemple23.dto.UserInDto;
import com.example.exemple23.dto.UserInNoteDto;
import com.example.exemple23.services.UserService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("exemple")
public class Exemple {

    @GetMapping("test")
    public String hello()
    {
        return "Bonjour à tous";
    }

    @GetMapping("introduice")
    public String Bonjour(@RequestParam String prenom, @RequestParam String nom)
    {
        return "Bonjour je m'appelle " + prenom + " " + nom;
    }

    @GetMapping("test2")
    public String test(@RequestParam List<Integer> note)
    {
        return note.toString();
    }

    @GetMapping("test3/{id}")
    public ResponseEntity test3 (@PathVariable String id){

        try {
            Integer ID = Integer.parseInt(id);
            return new ResponseEntity("Mon ID est " + ID, HttpStatusCode.valueOf(200));
        } catch (NumberFormatException e){
            return new ResponseEntity("ID au format incorrect", HttpStatusCode.valueOf(400));
        }

    }

    @PostMapping("ajouter")
    public ResponseEntity add(@RequestBody UserInDto dto){

        UserService service = new UserService();
        return new ResponseEntity(service.toOutDto(dto),HttpStatusCode.valueOf(200) );
    }

    @PostMapping("avg")
    public ResponseEntity moyenne(@RequestBody UserInNoteDto dto){
        UserService service = new UserService();
        return new ResponseEntity(service.toDto(dto), HttpStatusCode.valueOf(200));
    }
}
