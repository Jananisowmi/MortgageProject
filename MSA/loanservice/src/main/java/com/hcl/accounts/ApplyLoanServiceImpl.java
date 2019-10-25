package com.hcl.accounts;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ApplyLoanServiceImpl implements ApplyLoanService {
	@Autowired
	ApplyLoanRepository applyLoanRepository;
	
	@Override
	public String applyLoan(ApplyLoan acc) {

		ApplyLoan temp=applyLoanRepository.save(acc);
				String str="";
				if (temp != null) {
					str= "Application has been submitted";
				} else {
					str= "Not submitted";
				}
			
			return str;
	}

}
