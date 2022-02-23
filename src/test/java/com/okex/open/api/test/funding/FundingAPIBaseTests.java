package com.okex.open.api.test.funding;

import com.okex.open.api.config.APIConfiguration;
import com.okex.open.api.enums.I18nEnum;
import com.okex.open.api.test.BaseTests;


public class FundingAPIBaseTests extends BaseTests {

    public APIConfiguration config() {
        APIConfiguration config = new APIConfiguration();

        config.setEndpoint("https://www.okx.com/");

        config.setApiKey("6de74671-3b69-415e-b7e6-b979dd382849");
        config.setSecretKey("C24FF007CB38087B0E2058147ADBF82A");
        config.setPassphrase("ku66Ur6dVNCYW5i");


        config.setPrint(true);
        config.setSimulatedTrading(false);
        config.setI18n(I18nEnum.SIMPLIFIED_CHINESE);
        return config;
    }

    /**
     * Public parameters
     */
    int from = 0;
    int to = 0;
    int limit = 20;



}
