package com.okex.open.api.test.publicData;

import com.okex.open.api.config.APIConfiguration;
import com.okex.open.api.enums.I18nEnum;
import com.okex.open.api.test.BaseTests;

public class PublicDataAPIBaseTest extends BaseTests {
    public APIConfiguration config() {
        APIConfiguration config = new APIConfiguration();


        config.setEndpoint("https://www.ouyi.art/");
//        config.setApiKey("cad6e3bc-a406-4a28-8466-2ef050e70f1d");
//        config.setSecretKey("CC3E04439CE003C133847335F3D4ECED");
//        config.setPassphrase("75ThBHPxvRDf3NR");

        // 模拟
        config.setApiKey("e824ae5b-8a1d-43f7-a3c4-e86e52446abb");
        config.setSecretKey("9AEB44AC17084DC33BD2B364BF486B03");
        config.setPassphrase("6eAdaSxFJbn3vp6");


        config.setPrint(true);
        /* config.setI18n(I18nEnum.SIMPLIFIED_CHINESE);*/
        config.setI18n(I18nEnum.SIMPLIFIED_CHINESE);
        return config;
    }
}
