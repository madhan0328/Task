package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.CloudVendorRepository;
import com.example.demo.model.Cloudvendor;

@Service
public class CloudvendorserviceImp implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudvendorserviceImp(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String getCloudvendorDetails(String userid) {
        cloudVendorRepository.findById(userid).get();
        return "success";
    }

    @Override
    public String createCloudvendorDetails(Cloudvendor cloudvendor) {
        cloudVendorRepository.save(cloudvendor);
        return "Success";
    }

    @Override
    public String updatecloudvendorDetails(Cloudvendor cloudvendor) {
        cloudVendorRepository.save(cloudvendor);
        return "Success";
    }

    @Override
    public String deleteCloudvendorDetails(String userid) {
        cloudVendorRepository.deleteById(userid);
        return "Success";
    }

    @Override
    public List<Cloudvendor> getAllCloudvendorDetails() {
        return cloudVendorRepository.findAll();
    }
}