package com.okex.open.api.service.status.impl;

import com.alibaba.fastjson.JSONObject;
import com.okex.open.api.client.APIClient;
import com.okex.open.api.config.APIConfiguration;
import com.okex.open.api.service.status.StatusDataAPIService;

import java.net.Proxy;

public class StatusDataAPIServiceImpl implements StatusDataAPIService {

    private final APIClient client;
    private final StatusDataAPI statusDataAPI;

    public StatusDataAPIServiceImpl(final APIConfiguration config, Proxy proxy) {
        this.client = new APIClient(config,proxy);
        this.statusDataAPI = this.client.createService(StatusDataAPI.class);
    }

    //status
    @Override
    public JSONObject getStatus(String state) {
        return this.client.executeSync(this.statusDataAPI.getStatus(state));
    }
}
