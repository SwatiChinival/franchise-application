package com.franchiseapplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franchiseapplication.entities.ApplicantDetails;
import com.franchiseapplication.models.ApplicationFormSubmitRequest;
import com.franchiseapplication.models.ApplicationFormSubmitResponse;
import com.franchiseapplication.repositories.ApplicantDetailsRepository;
import com.franchiseapplication.utility.DateUtils;

@Service
public class FranchiseApplicationServiceImplementation implements FranchiseApplicationService{

	@Autowired
	private ApplicantDetailsRepository applicantDetailsRepository;
	
	@Override
	public ApplicationFormSubmitResponse submitApplicantForm(ApplicationFormSubmitRequest applicationFormSubmitRequest) {
		
		ApplicantDetails applicantDetails = mapEntityFromRequest(applicationFormSubmitRequest);
		
		applicantDetails = applicantDetailsRepository.save(applicantDetails);
		
		ApplicationFormSubmitResponse applicationFormSubmitResponse =  mapResponseFromEntity(applicantDetails);
				
		return applicationFormSubmitResponse;
	}
	
	@Override
	public ApplicationFormSubmitResponse getApplicantFormDetails(long id) {
		
		Optional<ApplicantDetails> applicantDetails = applicantDetailsRepository.findById(id);
		
		ApplicationFormSubmitResponse applicationFormSubmitResponse =  mapResponseFromEntity(applicantDetails.get());
		
		return applicationFormSubmitResponse;
	}

	private ApplicantDetails mapEntityFromRequest(ApplicationFormSubmitRequest applicationFormSubmitRequest) {
		ApplicantDetails applicantDetails = new ApplicantDetails();
		applicantDetails.setAdditionalNotes(applicationFormSubmitRequest.getAdditionalNotes());
		applicantDetails.setAddress(applicationFormSubmitRequest.getContactAddress());
		applicantDetails.setDateOfBirth(DateUtils.convertDateFormat(applicationFormSubmitRequest.getDateOfBirth()));
		applicantDetails.setEmailId(applicationFormSubmitRequest.getContactEmail());
		applicantDetails.setIdNumber(applicationFormSubmitRequest.getIdNumber());
		applicantDetails.setInterestInBrand(applicationFormSubmitRequest.getInterestInBrand());
		applicantDetails.setInvestmentAmount(applicationFormSubmitRequest.getInvestmentAmount());
		applicantDetails.setName(applicationFormSubmitRequest.getApplicantName());
		applicantDetails.setPhone(applicationFormSubmitRequest.getContactPhone());
		applicantDetails.setPrefferedGeographicalArea(applicationFormSubmitRequest.getPrefferedGeographicalArea());
		applicantDetails.setPreviousExperience(applicationFormSubmitRequest.getPreviousExperience());
		applicantDetails.setTimeCreated(DateUtils.getNow());
		return applicantDetails;
	}

	private ApplicationFormSubmitResponse mapResponseFromEntity(ApplicantDetails applicantDetails) {
		ApplicationFormSubmitResponse applicationFormSubmitResponse = new ApplicationFormSubmitResponse();
		applicationFormSubmitResponse.setId(applicantDetails.getId());
		applicationFormSubmitResponse.setAdditionalNotes(applicantDetails.getAdditionalNotes());
		applicationFormSubmitResponse.setContactAddress(applicantDetails.getAddress());
		applicationFormSubmitResponse.setDateOfBirth(applicantDetails.getDateOfBirth());
		applicationFormSubmitResponse.setContactEmail(applicantDetails.getEmailId());
		applicationFormSubmitResponse.setIdNumber(applicantDetails.getIdNumber());
		applicationFormSubmitResponse.setInterestInBrand(applicantDetails.getInterestInBrand());
		applicationFormSubmitResponse.setInvestmentAmount(applicantDetails.getInvestmentAmount());
		applicationFormSubmitResponse.setApplicantName(applicantDetails.getName());
		applicationFormSubmitResponse.setContactPhone(applicantDetails.getPhone());
		applicationFormSubmitResponse.setPrefferedGeographicalArea(applicantDetails.getPrefferedGeographicalArea());
		applicationFormSubmitResponse.setPreviousExperience(applicantDetails.getPreviousExperience());
		return applicationFormSubmitResponse;
	}
	
}