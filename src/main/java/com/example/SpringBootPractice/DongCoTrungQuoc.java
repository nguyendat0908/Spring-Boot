package com.example.SpringBootPractice;


import org.springframework.stereotype.Component;

// Danh dau duoc quan ly boi IOC Container
@Component
public class DongCoTrungQuoc implements DongCo {

    @Override
    public void NoMay() {
        System.out.println("Xe đang chạy động cơ: Trung Quốc! ");
    }
}
