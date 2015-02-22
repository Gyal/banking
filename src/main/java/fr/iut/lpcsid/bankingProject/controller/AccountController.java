package fr.iut.lpcsid.bankingProject.controller;

import fr.iut.lpcsid.bankingProject.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {
    private AccountRepository accountRepository;

    Logger logger = LoggerFactory.getLogger(AccountController.class);


    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        String msg = "Page Account" ;
        model.addAttribute("message", msg);

        logger.info("Msg is" + msg);

        return "index";
    }
    }
