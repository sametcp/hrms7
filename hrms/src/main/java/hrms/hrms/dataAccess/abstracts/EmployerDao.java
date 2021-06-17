package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Employer;
import hrms.hrms.entities.concretes.Jobseeker;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	
}
