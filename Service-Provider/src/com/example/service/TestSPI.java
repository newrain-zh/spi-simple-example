package com.example.service;

import com.example.spi.LoggerService;

public class TestSPI {


    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getService();
        loggerService.info("你好");
        loggerService.debug("测试Java SPI 机制");
    }

}