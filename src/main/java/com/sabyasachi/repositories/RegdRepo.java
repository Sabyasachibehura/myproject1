package com.sabyasachi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabyasachi.entity.Registration;

public interface RegdRepo extends JpaRepository<Registration, Integer> {

}
