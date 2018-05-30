package edu.eiu.tourist_app.dataModel;

import java.util.Map;

public class QueryResponse {

    private Map<Integer,WikipediaPage> pages;

    public Map<Integer, WikipediaPage> getPage() {
        return pages;
    }

    public void setPage(Map<Integer, WikipediaPage> page) {
        this.pages = page;
    }
}
