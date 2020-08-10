package com.twigaRest.twigaRestApp.controller;

import com.twigaRest.twigaRestApp.entity.EmailFromFrontEnd;
import org.springframework.web.bind.annotation.*;
import com.sendgrid.*;

import java.io.IOException;
import java.util.Base64;

@RestController
@CrossOrigin("*")
public class CustomControllerSeven {


    @GetMapping("/getEmailsAsReport")
    public EmailFromFrontEnd getEmailsAsReport() {

        System.out.println();
        return new EmailFromFrontEnd();

    }

    @PostMapping(value="/sendEmailsAsReport", consumes = "application/json", produces = "application/json")
    public Response sendEmailsAsReport(@RequestBody EmailFromFrontEnd emailContent) throws IOException {

        System.out.println(emailContent);

        Email to = new Email("logistics@twiga.com");
        String subject = emailContent.getEmailName();
        Email from = new Email("logistics@twiga.com");
        Attachments attachment = new Attachments();
//        Content content = new Content("text/csv" , emailContent.getCsvContent());
        Content content = new Content("text/plain" , "Attached is the following report: " + emailContent.getEmailName());

        System.out.println(emailContent.getCsvContent());
        System.out.println(convertFileToBase64(emailContent.getCsvContent().getBytes()));

        Mail mail = new Mail(from, subject, to, content);

        attachment.setContent(convertFileToBase64(emailContent.getCsvContent().getBytes()));
        attachment.setFilename(emailContent.getEmailName());
        attachment.setType("text/csv");


        mail.addAttachments(attachment);


        SendGrid sg = new SendGrid("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");

        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());

            return response;


        } catch (IOException ex) {
            throw ex;
        }


    }

    private String convertFileToBase64(byte[] input) {
        return Base64.getEncoder().encodeToString(input);
    }
}

