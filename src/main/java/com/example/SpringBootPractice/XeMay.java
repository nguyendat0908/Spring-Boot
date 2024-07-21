package com.example.SpringBootPractice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XeMay {

    @Autowired      // Khi dung Autowired thi khong phai dung constructor inject truc tiep vao field vao class
    private DongCo dongCo;

//    public XeMay(DongCo dongCo) {
//        this.dongCo = dongCo;
//    }

    public void DiXe() {
        dongCo.NoMay();
    }

}
