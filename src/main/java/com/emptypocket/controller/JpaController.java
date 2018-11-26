package com.emptypocket.controller;

import com.emptypocket.bean.JpaBean;
import com.emptypocket.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import javax.validation.Valid;
import java.util.Optional;

@RestController
public class JpaController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    DataSource datasource;

    @GetMapping(value = "/getall")
    public ResponseEntity<Iterable<JpaBean>> getAllUser(Pageable pageable)
    {
        return new ResponseEntity<>(userRepo.findAll(pageable), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseEntity<JpaBean> createUser(@Valid @RequestBody JpaBean jpaBean)
    {
        return new ResponseEntity<>(userRepo.save(jpaBean), HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/getUserById/{id}")
    public ResponseEntity<Optional<JpaBean>> getUserById(@PathVariable int id)
    {
        return new ResponseEntity<>(userRepo.findById(id), HttpStatus.ACCEPTED);
    }
}
