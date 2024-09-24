/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mond
 */
@RestController
public class Common {
    
    @GetMapping("api/staffs")
    String[] list() {
        return data;
    }
    
    String[] data = new String[100];
    int count =0;
    
    @PutMapping("/api/staff")
    String add(@RequestParam("name") String s) {
        data[count] = s;
        count++;
        return "Success";
    }
}
