package com.okex.open.api.test.trade;

import com.okex.open.api.config.APIConfiguration;
import com.okex.open.api.enums.I18nEnum;
import com.okex.open.api.test.BaseTests;

public class TradeAPIBaseTest extends BaseTests {
    public APIConfiguration config() {
        APIConfiguration config = new APIConfiguration();

        config.setEndpoint("https://www.ouyi.art/");
        //生产
//        config.setApiKey("cad6e3bc-a406-4a28-8466-2ef050e70f1d");
//        config.setSecretKey("CC3E04439CE003C133847335F3D4ECED");
//        config.setPassphrase("75ThBHPxvRDf3NR");


        config.setApiKey("");
        config.setSecretKey("");
        config.setPassphrase("");


        config.setPrint(true);
       /* config.setI18n(I18nEnum.SIMPLIFIED_CHINESE);*/
        config.setI18n(I18nEnum.ENGLISH);
        return config;
    }


}
