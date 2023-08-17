package com.org.digihub.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.digihub.delegate.AppCompanyDelegate;
import com.org.digihub.delegate.AppDocumentDetailsDelegate;
import com.org.digihub.delegate.AppEmployeesDelegate;
import com.org.digihub.delegate.AppHeaderDelegate;
import com.org.digihub.delegate.AppQuestionDelegate;
import com.org.digihub.delegate.ConfigDocumentsDelegate;
import com.org.digihub.delegate.ConfigQuestionDelegate;
import com.org.digihub.delegate.HelpDeskDelegate;
import com.org.digihub.delegate.UserAdminDelegate;
import com.org.digihub.delegate.UserFintechDelegate;
import com.org.digihub.delegate.UserOpsDelegate;
import com.org.digihub.vo.DigiAppCompanyVO;
import com.org.digihub.vo.DigiAppDocumentDetailsVO;
import com.org.digihub.vo.DigiAppEmployeesVO;
import com.org.digihub.vo.DigiAppHeaderVO;
import com.org.digihub.vo.DigiAppQuestionVO;
import com.org.digihub.vo.DigiConfigDocumentsVO;
import com.org.digihub.vo.DigiConfigQuestionVO;
import com.org.digihub.vo.DigiHelpDeskVO;
import com.org.digihub.vo.DigiUserAdminVO;
import com.org.digihub.vo.DigiUserFintechVO;
import com.org.digihub.vo.DigiUserOpsVO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/services")
public class DigihubController {
	
	@Autowired
	AppHeaderDelegate appHeaderDelegate;
	
	@Autowired
	UserOpsDelegate userOpsDelegate;
	
	@Autowired
	ConfigQuestionDelegate configQuestionDelegate;
	
	@Autowired
	AppEmployeesDelegate appEmployeesDelegate;
	
	@Autowired
	AppDocumentDetailsDelegate appDocumentDetailsDelegate;
	
	@Autowired
	UserFintechDelegate userFintechDelegate;
	
	@Autowired
	UserAdminDelegate userAdminDelegate;
	
	@Autowired
	AppCompanyDelegate appCompanyDelegate;
	
	@Autowired
	AppQuestionDelegate appQuestionDelegate;
	
	@Autowired
	ConfigDocumentsDelegate configDocumentsDelegate;
	
	@Autowired
	HelpDeskDelegate helpDeskDelegate;
	
	// DIGI APP HEADER METHOD
	
	@PostMapping(value = "/getAppHeaderDetails")
	public DigiAppHeaderVO getAppHeaderDetails(@RequestBody Object requestObj) {
		DigiAppHeaderVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppHeaderVO.class);
		DigiAppHeaderVO appHeaderDetails = appHeaderDelegate.getAppHeaderDetails(requestVoObj.getUserId(), requestVoObj.getCompanyId());
		return appHeaderDetails;
	}
	
	@PostMapping(value = "/saveAppHeaderDetails")
	public String saveAppHeaderDetails(@RequestBody Object requestObj) {
		DigiAppHeaderVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppHeaderVO.class);
		String status = appHeaderDelegate.saveAppHeaderDetails(requestVoObj);
		return status;
	}
	
	// DIGI USER OPS METHOD
	
	@PostMapping(value = "/getUserOpsDetails")
	public DigiUserOpsVO getUserOpsDetails(@RequestBody Object requestObj) {
		DigiUserOpsVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiUserOpsVO.class);
		DigiUserOpsVO userOpsDetails = userOpsDelegate.getUserOpsDetails(requestVoObj.getUserId());
		return userOpsDetails;
	}
	
	@PostMapping(value = "/saveUserOpsDetails")
	public String saveUserOpsDetails(@RequestBody Object requestObj) {
		DigiUserOpsVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiUserOpsVO.class);
		String status = userOpsDelegate.saveUserOpsDetails(requestVoObj);
		return status;
	}
	
	// DIGI CONFIG QUESTION METHOD
	
	@PostMapping(value = "/getConfigQuestionDetails")
	public DigiConfigQuestionVO getConfigQuestionDetails(@RequestBody Object requestObj) {
		DigiConfigQuestionVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiConfigQuestionVO.class);
		DigiConfigQuestionVO configQuestionDetails = configQuestionDelegate.getConfigQuestionDetails(requestVoObj.getqId(), requestVoObj.getSectionId());
		return configQuestionDetails;
	}
	
	@PostMapping(value = "/saveConfigQuestionsDetails")
	public String saveConfigQuestionDetails(@RequestBody Object requestObj) {
		DigiConfigQuestionVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiConfigQuestionVO.class);
		String status = configQuestionDelegate.saveConfigQuestionDetails(requestVoObj);
		return status;
	}
	
	// APP EMPLOYEES METHOD
	
	@PostMapping(value = "/getAppEmployeesDetails")
	public DigiAppEmployeesVO getAppEmployeesDetails(@RequestBody Object requestObj) {
		DigiAppEmployeesVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppEmployeesVO.class);
		DigiAppEmployeesVO appEmployeesDetails = appEmployeesDelegate.getAppEmployeesDetails(requestVoObj.getUserId(), requestVoObj.getAppId());
		return appEmployeesDetails;
	}
	
	@PostMapping(value = "/saveAppEmployeesDetails")
	public String saveAppEmployeesDetails(@RequestBody Object requestObj) {
		DigiAppEmployeesVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppEmployeesVO.class);
		String status = appEmployeesDelegate.saveAppEmployeesDetails(requestVoObj);
		return status;
	}
	
	// APP DOCUMENT DETAILS METHOD
	
	@PostMapping(value = "/getAppDocumentDetails")
	public DigiAppDocumentDetailsVO getAppDocumentDetails(@RequestBody Object requestObj) {
		DigiAppDocumentDetailsVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppDocumentDetailsVO.class);
		DigiAppDocumentDetailsVO appDocumentDetails = appDocumentDetailsDelegate.getAppDocumentDetails(requestVoObj.getAppId(), requestVoObj.getDocumentId());
		return appDocumentDetails;
	}
	
	@PostMapping(value = "/saveAppEmployeesDetails")
	public String saveAppDocumentDetailsDetails(@RequestBody Object requestObj) {
		DigiAppDocumentDetailsVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppDocumentDetailsVO.class);
		String status = appDocumentDetailsDelegate.saveAppDocumentDetails(requestVoObj);
		return status;
	}
	
	//For DigiUserFintechVO
		@PostMapping(value = "/getUserFintechDetails")
		public DigiUserFintechVO getUserFintechDetails(@RequestBody Object requestObj) {
			DigiUserFintechVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiUserFintechVO.class);
			DigiUserFintechVO userFintechDetails = userFintechDelegate.getUserFintechDetails(requestVoObj.getUserId());
			return userFintechDetails;
		}
		
		@PostMapping(value = "/saveUserFintechDetails")
		public String saveUserFintechDetails(@RequestBody Object requestObj) {
			DigiUserFintechVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiUserFintechVO.class);
			String status = userFintechDelegate.saveUserFintechDetails(requestVoObj);
			return status;
		}
		
		//For DigiUserAdminVO
		@PostMapping(value = "/getUserAdminDetails")
		public DigiUserAdminVO getUserAdminDetails(@RequestBody Object requestObj) {
			DigiUserAdminVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiUserAdminVO.class);
			DigiUserAdminVO userAdminDetails = userAdminDelegate.getUserAdminDetails(requestVoObj.getUserId(), requestVoObj.getFirstName());
			return userAdminDetails;
		}
		
		@PostMapping(value = "/saveUserAdminDetails")
		public String saveUserAdminDetails(@RequestBody Object requestObj) {
			DigiUserAdminVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiUserAdminVO.class);
			String status = userAdminDelegate.saveUserAdminDetails(requestVoObj);
			return status;
		}
		
		//For DigiAppCompanyVO
		@PostMapping(value = "/getAppCompanyDetails")
		public DigiAppCompanyVO getAppCompanyDetails(@RequestBody Object requestObj) {
			DigiAppCompanyVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppCompanyVO.class);
			DigiAppCompanyVO appCompanyDetails = appCompanyDelegate.getAppCompanyDetails(requestVoObj.getUserId(), requestVoObj.getCompanyId());
			return appCompanyDetails;
		}
		
		@PostMapping(value = "/saveAppCompanyDetails")
		public String saveAppCompanyDetails(@RequestBody Object requestObj) {
			DigiAppCompanyVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppCompanyVO.class);
			String status = appCompanyDelegate.saveAppCompanyDetails(requestVoObj);
			return status;
		}
		
		//For DigiAppQuestionVO
		@PostMapping(value = "/getAppQuestionDetails")
		public DigiAppQuestionVO getAppQuestionDetails(@RequestBody Object requestObj) {
			DigiAppQuestionVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppQuestionVO.class);
			DigiAppQuestionVO appQuestionDetails = appQuestionDelegate.getAppQuestionDetails(requestVoObj.getUserId(), requestVoObj.getAppId());
			return appQuestionDetails;
		}
		
		@PostMapping(value = "/saveAppQuestionDetails")
		public String saveAppQuestionDetails(@RequestBody Object requestObj) {
			DigiAppQuestionVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiAppQuestionVO.class);
			String status = appQuestionDelegate.saveAppQuestionDetails(requestVoObj);
			return status;
		}
		
		//For DigiConfigDocumentsVO
		@PostMapping(value = "/getConfigDocumentsDetails")
		public DigiConfigDocumentsVO getConfigDocumentsDetails(@RequestBody Object requestObj) {
			DigiConfigDocumentsVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiConfigDocumentsVO.class);
			DigiConfigDocumentsVO configDocumentsDetails = configDocumentsDelegate.getConfigDocumentsDetails(requestVoObj.getDocId());
			return configDocumentsDetails;
		}
		
		@PostMapping(value = "/saveConfigDocumentsDetails")
		public String saveConfigDocumentsDetails(@RequestBody Object requestObj) {
			DigiConfigDocumentsVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiConfigDocumentsVO.class);
			String status = configDocumentsDelegate.saveConfigDocumentsDetails(requestVoObj);
			return status;
		}
		

		//For HelpDesk
		@PostMapping(value = "/getHelpDeskDetails")
		public List<DigiHelpDeskVO> getHelpDeskDetails(@RequestBody Object requestObj) {
			DigiHelpDeskVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiHelpDeskVO.class);
			List<DigiHelpDeskVO> helpDesketails = helpDeskDelegate.getHelpDeskDetails(requestVoObj.getUserId(), requestVoObj.getAppId());
			return helpDesketails;
		}
		
		@PostMapping(value = "/saveHelpDeskDetails")
		public String saveHelpDeskDetails(@RequestBody Object requestObj) {
			DigiHelpDeskVO requestVoObj = new ObjectMapper().convertValue(requestObj, DigiHelpDeskVO.class);
			String status = helpDeskDelegate.saveHeaderDetails(requestVoObj);

			return status;
		}
}
