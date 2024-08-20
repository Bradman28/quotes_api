package com.surinak.quote_api.hello;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// importing the different frameworks
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class Hello {

    @RequestMapping("/hello")
    public String hello(
        @RequestParam(value="user", required=false, defaultValue="Champ")
        String user, 
        Model model) {
        model.addAttribute("user", user);
        return "hello";
    }

    @RequestMapping("/show_quote")

    public String quote_api(
        @RequestParam(value="quote_is", required=false, defaultValue="Empty")
        String quote_is, Model model) throws IOException, InterruptedException {
        model.addAttribute("quote_is", quote_is);

        HttpRequest request = HttpRequest.newBuilder()
		    .uri(URI.create("https://quotes15.p.rapidapi.com/quotes/random/?language_code=en"))
		    .header("x-rapidapi-key", "6235ba88f4msh0f02c11294533a9p13227ejsnabc025319b56")
		    .header("x-rapidapi-host", "quotes15.p.rapidapi.com")
		    .method("GET", HttpRequest.BodyPublishers.noBody())
		    .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        // convert response to a string
        String resp_body = response.body().toString();
        ObjectMapper mapper = new ObjectMapper();
        Catch_Quote this_quote = mapper.readValue(resp_body, Catch_Quote.class);
        quote_is = this_quote.content;
        model.addAttribute("quote_is", quote_is);
        return "/show_quote";
    }
    
}
