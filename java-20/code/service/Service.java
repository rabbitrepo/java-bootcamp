/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mond
 */
@RestController
public class Service {

    @RequestMapping("/api/get-total")
    double getTotal(@RequestParam("price") double price) {
        return price * 0.95;
    }

    @RequestMapping("/api/get-final")
    String a(@RequestParam("price") String price) {
        try {
            double p = Double.valueOf(price);
            return " " + p * 0.95;
        } catch (Exception e) {
            return "Invalid 'Price'";
        }
    }
}
