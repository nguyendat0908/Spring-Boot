package com.example.SpringBootPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPracticeApplication {

	public static void main(String[] args) {

		// Khong can khoi tao doi tuong lay tu IOC Container ra
		ApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);
//		DongCoTrungQuoc dongCoTrungQuoc = context.getBean(DongCoTrungQuoc.class);
//		DongCoMy dongCoMy = context.getBean(DongCoMy.class);

		XeMay xeMay = context.getBean(XeMay.class);
		xeMay.DiXe();


		// Tiêm phụ thuộc vào constructor
//        XeMay xeMay = new XeMay(dongCoTrungQuoc);
//        xeMay.DiXe();

		// Tiêm phụ thuộc bằng setter
//        xeMay.setDongCo(dongCoMy);
//        xeMay.DiXe();

		// Tiêm phụ thuộc bằng Interface
//		xeMay.set(dongCoMy);
//		xeMay.DiXe();
	}

}
