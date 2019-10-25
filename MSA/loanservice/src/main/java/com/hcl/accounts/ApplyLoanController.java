package com.hcl.accounts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class ApplyLoanController {

	@Autowired
	ApplyLoanService applyLoanService;

	@RequestMapping("/apply")
	public ResponseEntity<String> saveApplyLoan(@RequestBody ApplyLoan al) {
		try {
			return new ResponseEntity<String>(applyLoanService.applyLoan(al), new HttpHeaders(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Not submitted", new HttpHeaders(), HttpStatus.NOT_FOUND);
		}
	}

}
