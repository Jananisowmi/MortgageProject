package com.hcl.accounts;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ApplyLoanRepository extends CrudRepository<ApplyLoan, Integer>{
		
}
