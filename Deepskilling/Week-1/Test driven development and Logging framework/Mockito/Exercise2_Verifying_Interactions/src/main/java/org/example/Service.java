package org.example;

public class Service {

    private ExternalApi api;

    public Service(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        api.getData();
    }
}