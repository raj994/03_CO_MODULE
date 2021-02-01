package com.app.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.CoPdfs;

public interface CoPdfsRepository extends JpaRepository<CoPdfs, Serializable> {

}
