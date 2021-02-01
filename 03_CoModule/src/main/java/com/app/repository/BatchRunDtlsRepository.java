package com.app.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.BatchRunDtls;

public interface BatchRunDtlsRepository extends JpaRepository<BatchRunDtls, Serializable> {

}
