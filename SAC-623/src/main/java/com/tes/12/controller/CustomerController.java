package com.tes.12.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tes.12.model.Customer;
import com.tes.12.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/mobile-number/{mobileNumber}")
    public Optional<Customer> findByMobileNumber(@PathVariable String mobileNumber) {
        return customerService.findByMobileNumber(mobileNumber);
    }

    @GetMapping("/crif-score/{crifScore}")
    public Optional<Customer> findByCRIFScore(@PathVariable int crifScore) {
        return customerService.findByCRIFScore(crifScore);
    }

    @GetMapping("/family-income/{familyIncome}")
    public Optional<Customer> findByFamilyIncome(@PathVariable double familyIncome) {
        return customerService.findByFamilyIncome(familyIncome);
    }

    @GetMapping("/ekyc-ckyc/{ekycCkyc}")
    public Optional<Customer> findByEkycCkyc(@PathVariable boolean ekycCkyc) {
        return customerService.findByEkycCkyc(ekycCkyc);
    }

    @GetMapping("/spouse-data/{spouseData}")
    public Optional<Customer> findBySpouseData(@PathVariable String spouseData) {
        return customerService.findBySpouseData(spouseData);
    }

    @GetMapping("/verified-dob/{verifiedDOB}")
    public Optional<Customer> findByVerifiedDOB(@PathVariable String verifiedDOB) {
        return customerService.findByVerifiedDOB(verifiedDOB);
    }

    @GetMapping("/min-sum-assured/{minSumAssured}")
    public Optional<Customer> findByMinSumAssured(@PathVariable int minSumAssured) {
        return customerService.findByMinSumAssured(minSumAssured);
    }

    @GetMapping("/eligibility/{eligibility}")
    public Optional<Customer> findByEligibility(@PathVariable boolean eligibility) {
        return customerService.findByEligibility(eligibility);
    }

    @GetMapping("/data-push/{dataPush}")
    public Optional<Customer> findByDataPush(@PathVariable boolean dataPush) {
        return customerService.findByDataPush(dataPush);
    }

    @GetMapping("/coi/{COI}")
    public Optional<Customer> findByCOI(@PathVariable String COI) {
        return customerService.findByCOI(COI);
    }

    @GetMapping("/coi-download-api/{COIDownloadAPI}")
    public Optional<Customer> findByCOIDownloadAPI(@PathVariable boolean COIDownloadAPI) {
        return customerService.findByCOIDownloadAPI(COIDownloadAPI);
    }

    @GetMapping("/coi-shared/{COIShared}")
    public Optional<Customer> findByCOIShared(@PathVariable boolean COIShared) {
        return customerService.findByCOIShared(COIShared);
    }

    @GetMapping("/reverse-feed/{reverseFeed}")
    public Optional<Customer> findByReverseFeed(@PathVariable boolean reverseFeed) {
        return customerService.findByReverseFeed(reverseFeed);
    }
}