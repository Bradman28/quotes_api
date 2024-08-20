package com.surinak.quote_api.hello;

import java.util.ArrayList;
import java.util.HashMap;

public class Catch_Quote {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HashMap<String, String> getOriginator() {
        return originator;
    }

    public void setOriginator(HashMap<String, String> originator) {
        this.originator = originator;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    // "id": 998053, 
    int id = 0;

    // "language_code": "en", 
    String language_code = "";

    // "content": "Remember, today is the tomorrow you worried about yesterday.", 
    String content = "";

    // "url": "https://quotepark.com/quotes/998053-dale-carnegie-remember-today-is-the-tomorrow-you-worried-about/", 
    String url = "";

    // "originator": {"id": 127536, "language_code": "en", "description": "", "master_id": 658, "name": "Dale Carnegie", "url": "https://quotepark.com/authors/dale-carnegie/"}, 
    HashMap<String, String> originator =  new HashMap<>();

    // "tags": ["Happy", "Faith", "Business", "Powerful", "Funny", "today", "tomorrow", "worry", "yesterday"]
    ArrayList<String> tags = new ArrayList<>();

}
