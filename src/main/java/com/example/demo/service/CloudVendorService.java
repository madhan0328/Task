package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Cloudvendor;

public interface CloudVendorService {

    // Cloudvendor createCloudvendorDetails(Cloudvendor cloudvendor);
    // Cloudvendor updatecloudvendorDetails(Cloudvendor cloudvendor);
    // String deleteCloudvendorDetails(String userid);
    // Cloudvendor getCloudvendorDetails(String userid);
    // List<Cloudvendor> getAllCloudvendorDetails();

    public String getCloudvendorDetails(String userid);

    public String createCloudvendorDetails(Cloudvendor cloudvendor);

    public String updatecloudvendorDetails(Cloudvendor cloudvendor);

    public String deleteCloudvendorDetails(String userid);

    public List<Cloudvendor> getAllCloudvendorDetails();

    // public Cloudvendor getCloudvendorDetails(String userid);
    // public Cloudvendor createCloudvendorDetails(Cloudvendor cloudvendor);
    // public Cloudvendor updatecloudvendorDetails(Cloudvendor cloudvendor);
    // public String deleteCloudvendorDetails(String userid);
    // public List<Cloudvendor> getAllCloudvendorDetails();

    // public String createCloudvendorDetails(Cloudvendor cloudvendor);
    // public String updateCloudvendorDetails(Cloudvendor cloudvendor);
    // public String deleteCloudvendorDetails(String userid);
    // public Cloudvendor getCloudvendor(String userid);
    // public List<Cloudvendor> getALLCloudvendors();

}
