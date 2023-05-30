package com.springboot.product.example.Controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.springboot.product.example.Service.SalesService;
import com.springboot.product.example.entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping("/maxvalue")
    public List<Sales> maxSales() {
        for (int i = 0; i < 1000000000; i++) {
            System.out.println(i);
        }

        return salesService.maxSales();
    }

    @GetMapping("/minvalue")
    public List<Sales> minSales() {
        return salesService.minSales();
    }


    @GetMapping("/")
    public @ResponseBody
    String index() throws IOException {
        ClassPathResource resource = new ClassPathResource("static/index.html");
        return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
    }
}

