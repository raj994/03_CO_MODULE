package com.app.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.BatchSummary;

public interface BatchSummaryRepository extends JpaRepository<BatchSummary, Serializable> {

}
