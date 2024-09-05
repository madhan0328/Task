
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cloudvendor;
import com.example.demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudvendorController {

    @Autowired
    private CloudVendorService cloudVendorService;

    @GetMapping("{Userid}") // Api Endpoint
    public String getCloudVendorDetails(String Userid) // Get the userid
    {
        return cloudVendorService.getCloudvendorDetails(Userid);
    }

    @PostMapping("/create")
    public String createCloudvendorDetails(@RequestBody Cloudvendor cloudvendor) {
        return cloudVendorService.createCloudvendorDetails(cloudvendor);

    }

    @PutMapping
    public String updateCloudvendorDetails(@RequestBody Cloudvendor cloudvendor) {
        return cloudVendorService.updatecloudvendorDetails(cloudvendor);

    }

    @DeleteMapping({ "Userid" })
    public String deleteCloudvendorDetails(String Userid) {
        return cloudVendorService.deleteCloudvendorDetails(Userid);

    }

    @GetMapping // Api Endpoint
    public List<Cloudvendor> getAllCloudVendorDetails() // Get the userid
    {
        return cloudVendorService.getAllCloudvendorDetails();
    }

}
