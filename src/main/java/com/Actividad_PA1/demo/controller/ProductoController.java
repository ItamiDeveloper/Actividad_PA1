/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Actividad_PA1.demo.controller;

/**
 *
 * @author LAB_P03
 */

import com.Actividad_PA1.demo.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductoController {

    @GetMapping("/viewProducto")
    public String viewProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "viewProducto";
    }

    @PostMapping("/successProducto")
    public String successProducto(@ModelAttribute Producto producto, Model model) {
        model.addAttribute("producto", producto);
        return "successProducto";
    }
}

