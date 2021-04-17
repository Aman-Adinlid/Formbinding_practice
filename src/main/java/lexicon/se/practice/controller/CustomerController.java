package lexicon.se.practice.controller;

import lexicon.se.practice.dto.Customer;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller

public class CustomerController implements WebMvcConfigurer {



    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(Customer customer) {
        return "customer";
    }

    @GetMapping("/customer")
    public String checkCustomerInfo(@Valid Customer customer, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "customer";
        }

        return "redirect:/results";
    }
    
    @GetMapping("/customerDetails")
    public String ShowCustomerDetails(){
        return "customerDetails";
    }
}
