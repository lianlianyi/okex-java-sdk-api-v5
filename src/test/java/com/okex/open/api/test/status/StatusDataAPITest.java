package com.okex.open.api.test.status;


import com.alibaba.fastjson.JSONObject;
import com.okex.open.api.service.status.StatusDataAPIService;
import com.okex.open.api.service.status.impl.StatusDataAPIServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.net.Proxy;

public class StatusDataAPITest extends StatusDataAPIBaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(StatusDataAPITest.class);
    private StatusDataAPIService statusDataAPIService;
    Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("",0));

    @Before
    public void before() {
        config = config();
        statusDataAPIService = new StatusDataAPIServiceImpl(config,proxy);
    }


    /**
     * status
     * GET /api/v5/system/status
     */
    @Test
    public void testGetStatus(){
        JSONObject result = statusDataAPIService.getStatus(null);
        this.toResultString(StatusDataAPITest.LOG, "result", result);

    }




}
