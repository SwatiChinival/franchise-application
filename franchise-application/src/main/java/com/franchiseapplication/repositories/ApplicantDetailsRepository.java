package com.franchiseapplication.repositories;

import org.springframework.stereotype.Repository;

import com.franchiseapplication.entities.ApplicantDetails;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ApplicantDetailsRepository extends CrudRepository<ApplicantDetails, Long>{

}
