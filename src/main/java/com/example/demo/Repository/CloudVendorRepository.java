package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cloudvendor;

public interface CloudVendorRepository extends JpaRepository<Cloudvendor, String> {

    List<Cloudvendor> findByVendorName(String Username);
}