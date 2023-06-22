package cl.musicpro.webpayamb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.webpayamb.client.WebPayFeignClient;
import cl.musicpro.webpayamb.model.WebPayInitTransactionDTO;

@Service
public class WebPayService {
    
    @Autowired
    WebPayFeignClient webPayFeignClient;
    public String createTransaction(String tbkApiKeyId,
                                    String tbkApiKeySecret,
                                    WebPayInitTransactionDTO webPayInitTransactionDTO){
        return webPayFeignClient.createTransaction(tbkApiKeyId, tbkApiKeySecret, webPayInitTransactionDTO);                            
    }
}
