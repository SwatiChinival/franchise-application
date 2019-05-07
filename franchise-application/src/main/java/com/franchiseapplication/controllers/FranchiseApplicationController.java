package com.franchiseapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.franchiseapplication.models.ApplicationFormSubmitRequest;
import com.franchiseapplication.models.ApplicationFormSubmitResponse;
import com.franchiseapplication.service.FranchiseApplicationService;
import com.franchiseapplication.utility.StringConstants;

@RestController
@RequestMapping("/franchise")
public class FranchiseApplicationController {
	
	@Autowired
	private FranchiseApplicationService franchiseApplicationService;

	@PostMapping(value = StringConstants.FRANCHISE_FORM,consumes = StringConstants.APPLICATION_JSON, produces = StringConstants.APPLICATION_JSON)
	public ApplicationFormSubmitResponse submitApplicantForm(@RequestBody ApplicationFormSubmitRequest applicationFormSubmitRequest) throws Exception{
		
		ApplicationFormSubmitResponse applicationFormSubmitResponse = franchiseApplicationService.submitApplicantForm(applicationFormSubmitRequest);
		
		return applicationFormSubmitResponse;
	}
	
	@GetMapping
	public ApplicationFormSubmitResponse getApplicantDetails(@RequestParam(value = "id", required = true) long id) throws Exception{

		ApplicationFormSubmitResponse applicationFormSubmitResponse = franchiseApplicationService.getApplicantFormDetails(id);

		return applicationFormSubmitResponse;
	}
}
