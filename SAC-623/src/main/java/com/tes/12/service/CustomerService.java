package com.tes.12.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tes.12.model.Customer;
import com.tes.12.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Customer> findByMobileNumber(String mobileNumber) {
        return customerRepository.findByMobileNumber(mobileNumber);
    }

    public Optional<Customer> findByCRIFScore(int crifScore) {
        return customerRepository.findByCRIFScore(crifScore);
    }

    public Optional<Customer> findByFamilyIncome(double familyIncome) {
        return customerRepository.findByFamilyIncome(familyIncome);
    }

    public Optional<Customer> findByEkycCkyc(boolean ekycCkyc) {
        return customerRepository.findByEkycCkyc(ekycCkyc);
    }

    public Optional<Customer> findBySpouseData(String spouseData) {
        return customerRepository.findBySpouseData(spouseData);
    }

    public Optional<Customer> findByVerifiedDOB(String verifiedDOB) {
        return customerRepository.findByVerifiedDOB(verifiedDOB);
    }

    public Optional<Customer> findByMinSumAssured(int minSumAssured) {
        return customerRepository.findByMinSumAssured(minSumAssured);
    }

    public Optional<Customer> findByEligibility(boolean eligibility) {
        return customerRepository.findByEligibility(eligibility);
    }

    public Optional<Customer> findByDataPush(boolean dataPush) {
        return customerRepository.findByDataPush(dataPush);
    }

    public Optional<Customer> findByCOI(String COI) {
        return customerRepository.findByCOI(COI);
    }

    public Optional<Customer> findByCOIDownloadAPI(boolean COIDownloadAPI) {
        return customerRepository.findByCOIDownloadAPI(COIDownloadAPI);
    }

    public Optional<Customer> findByCOIShared(boolean COIShared) {
        return customerRepository.findByCOIShared(COIShared);
    }

    public Optional<Customer> findByReverseFeed(boolean reverseFeed) {
        return customerRepository.findByReverseFeed(reverseFeed);
    }
}