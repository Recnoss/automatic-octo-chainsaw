package no.ssb.mod.p1.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.Locale;

@RestController
public class DemoController {
    @RequestMapping("/")
    public String index() throws Exception{
        return "Tjobing fra host "+ InetAddress.getLocalHost().getHostName()+" med ip-adresse "+InetAddress.getLocalHost().getHostAddress();
    }
}
