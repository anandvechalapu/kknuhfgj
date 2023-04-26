package com.tes.12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tes.12.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByMobileNumber(String mobileNumber);
    Customer findByCRIFScore(int crifScore);
    Customer findByFamilyIncome(double familyIncome);
    Customer findByEkycCkyc(boolean ekycCkyc);
    Customer findBySpouseData(String spouseData);
    Customer findByVerifiedDOB(String verifiedDOB);
    Customer findByMinSumAssured(int minSumAssured);
    Customer findByEligibility(boolean eligibility);
    Customer findByDataPush(boolean dataPush);
    Customer findByCOI(String COI);
    Customer findByCOIDownloadAPI(boolean COIDownloadAPI);
    Customer findByCOIShared(boolean COIShared);
    Customer findByReverseFeed(boolean reverseFeed);
}