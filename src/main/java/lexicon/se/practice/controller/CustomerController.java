package lexicon.se.practice.controller;

import lexicon.se.practice.entity.Customer;
import lexicon.se.practice.entity.CustomerDetails;
import lexicon.se.practice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/adding")
public class CustomerController {

    CustomerRepository customerRepository;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/addForm")
    public String showCustomerForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customerForm";

    }

    @GetMapping("/")
    public String getAll(Model model) {
        List<Customer> customers = new ArrayList<>();
        Iterator<Customer> iterator = customerRepository.findAll().iterator();
        iterator.forEachRemaining(customers::add);
        model.addAttribute("customers", customers);
        return "showCustomerList";
    }

    @PostMapping("/add")
    public String addCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult bindingResult) {
        System.out.println("customer = " + customer);
        if (bindingResult.hasErrors()) {
            return "customerForm";
        }
        return "redirect:/adding/";

    }

    @GetMapping("/details")
    public String showCustomerDetails(Model model) {
        CustomerDetails customerDetails = new CustomerDetails();
        model.addAttribute("customerDetails", customerDetails);
        return "showCustomerDetails";
    }

   // @PostMapping("/addDetails")
   // public String addCustomerDetails(@ModelAttribute("customerDetails") @Valid CustomerDetails customerDetails, BindingResult bindingResult) {
      //  System.out.println("customerDetails = " + customerDetails);
       // if (bindingResult.hasErrors()) {
      //      return "showCustomerDetails";
        }
      //  return "redirect:/adding/addDetails";




