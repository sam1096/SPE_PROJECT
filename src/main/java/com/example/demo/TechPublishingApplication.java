package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Date;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.Respository.AdminAreaRepository;
import com.example.demo.Respository.AdminRepository;
import com.example.demo.Respository.AreaInterestRepository;
import com.example.demo.Respository.UserRepository;
import com.example.demo.model.Admin;
import com.example.demo.model.AdminArea;
import com.example.demo.model.AreaInterest;




@SpringBootApplication
@EnableJpaRepositories("com.example.demo.Respository")
public class TechPublishingApplication  implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	AdminRepository adminRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	AreaInterestRepository areainterestRepository;
	@Autowired
	AdminAreaRepository adminareaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TechPublishingApplication.class, args);
	}
	
		@Override
	public void run(String... args) throws Exception {
		Admin ad = new Admin();
		ad.setName("root");
		ad.setPassword("root");
		ad.setAdminname("root");
		ad.setEmail("root@gmail.com");
		ad.setPhoneNo("9718629881");
		adminRepository.save(ad);
		
		Admin ad1 = new Admin();
		ad1.setName("admin");
		ad1.setPassword("admin");
		ad1.setAdminname("admin");
		ad1.setEmail("admin@gmail.com");
		ad1.setPhoneNo("9718234901");
		adminRepository.save(ad1);
		
		
			AreaInterest a1=new AreaInterest();
			a1.setAreaid("PRO001");
			a1.setAreaname("Programming");
			AreaInterest a2=new AreaInterest();
			a2.setAreaid("MUL002");
			a2.setAreaname("MultiMedia");
			AreaInterest a3=new AreaInterest();
			a3.setAreaid("NC0003");
			a3.setAreaname("Networking and Communications");
			AreaInterest a4=new AreaInterest();
			a4.setAreaid("ML0004");
			a4.setAreaname("Machine Learning");
			AreaInterest a5=new AreaInterest();
			a5.setAreaid("CS0005");
			a5.setAreaname("Chemical Science");
			AreaInterest a6=new AreaInterest();
			a6.setAreaid("CIV006");
			a6.setAreaname("Civil Engineering");
			AreaInterest a7=new AreaInterest();
			a7.setAreaid("ART007");
			a7.setAreaname("Arts");
			AreaInterest a8=new AreaInterest();
			a8.setAreaid("BIO008");
			a8.setAreaname("Biology");
			AreaInterest a9=new AreaInterest();
			a9.setAreaid("PHY009");
			a9.setAreaname("Physical Science");
			AreaInterest a10=new AreaInterest();
			a10.setAreaid("MAT010");
			a10.setAreaname("Mathematics");
			AreaInterest a11=new AreaInterest();
			a11.setAreaid("HUM011");
			a11.setAreaname("Human Values and Ethics");
			
			AdminArea ar1=new AdminArea();
			ar1.setId(1);
			ar1.setAdminname("admin");
			ar1.setAreaid("PRO001");
			AdminArea ar2=new AdminArea();
			ar2.setId(2);
			ar2.setAdminname("admin");
			ar2.setAreaid("ML0004");
			AdminArea ar3=new AdminArea();
			ar3.setId(3);
			ar3.setAdminname("admin");
			ar3.setAreaid("NC0003");
			AdminArea ar4=new AdminArea();
			ar4.setId(4);
			ar4.setAdminname("admin");
			ar4.setAreaid("HUM011");
			AdminArea ar5=new AdminArea();
			ar5.setId(5);
			ar5.setAdminname("root");
			ar5.setAreaid("MAT010");
			AdminArea ar6=new AdminArea();
			ar6.setId(6);
			ar6.setAdminname("root");
			ar6.setAreaid("PRO001");
			AdminArea ar7=new AdminArea();
			ar7.setId(7);
			ar7.setAdminname("root");
			ar7.setAreaid("ML0004");
			AdminArea ar8=new AdminArea();
			ar8.setId(8);
			ar8.setAdminname("root");
			ar8.setAreaid("ART007");
	
	}

}


