package br.com.jeansemolini.soapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WebServiceConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("br.com.jeansemolini.soapclient.wsdl");
        return marshaller;
    }

    @Bean
    public WebServiceClient webServiceClient(Jaxb2Marshaller marshaller) {
        WebServiceClient webServiceClient = new WebServiceClient();
        webServiceClient.setDefaultUri("http://www.crcind.com/csp/samples/SOAP.Demo.cls");
        webServiceClient.setMarshaller(marshaller);
        webServiceClient.setUnmarshaller(marshaller);
        return webServiceClient;
    }

}
