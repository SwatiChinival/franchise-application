package com.franchiseapplication.service;

import com.franchiseapplication.models.ApplicationFormSubmitRequest;
import com.franchiseapplication.models.ApplicationFormSubmitResponse;

public interface FranchiseApplicationService {

	ApplicationFormSubmitResponse submitApplicantForm(ApplicationFormSubmitRequest applicationFormSubmitRequest);

	ApplicationFormSubmitResponse getApplicantFormDetails(long id);

}
