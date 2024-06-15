package br.thai.api.job.controller;

import br.thai.api.job.domain.user.record.UserListRecord;
import br.thai.api.job.domain.user.record.UserRegisterRecord;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    //POST, GET, PUT, DELETE, OPTIONS
    //CRUD,
    @PostMapping
    public ResponseEntity create(@RequestBody UserRegisterRecord record, UriComponentsBuilder uriBuilder){
    //TODO - implementar regra para salvar os dados
        URI uri = uriBuilder.path("/user").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body(record);
    }
    @GetMapping
    public ResponseEntity<List<UserListRecord>> listAll(){
        List<UserListRecord> resultados = new ArrayList<>();
        resultados.add(new UserListRecord(0L,"Thaiffane","000.000.000-00", "Madri germana"));
        resultados.add(new UserListRecord(1L,"Tamires","000.000.000-00", "Madri germana"));
        resultados.add(new UserListRecord(2L,"Joao","000.000.000-00", "Madri germana"));
        return ResponseEntity.ok(resultados);
    }
    @GetMapping("/{id}")
    public ResponseEntity listOne(@PathVariable Long id){

    }
    @PutMapping
    public void update(){

    }
    @DeleteMapping
    public void delete(){

    }
}
