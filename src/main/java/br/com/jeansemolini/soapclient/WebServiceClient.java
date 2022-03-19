package br.com.jeansemolini.soapclient;

import br.com.jeansemolini.soapclient.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class WebServiceClient extends WebServiceGatewaySupport {

    public AddIntegerResponse somar() {

        AddInteger soma = new AddInteger();
        soma.setArg1(1L);
        soma.setArg2(2L);
        AddIntegerResponse resultadoSoma = (AddIntegerResponse) getWebServiceTemplate()
                .marshalSendAndReceive(soma);
        return resultadoSoma;
    }

    public DivideIntegerResponse dividir() {
        DivideInteger divisao = new DivideInteger();
        divisao.setArg1(10L);
        divisao.setArg2(2L);
        DivideIntegerResponse resultadoDivisao = (DivideIntegerResponse) getWebServiceTemplate()
                .marshalSendAndReceive(divisao);
        return resultadoDivisao;
    }

    public FindPersonResponse buscarPessoa() {
        FindPerson busca = new FindPerson();
        busca.setId("1");
        FindPersonResponse resultadoBusca = (FindPersonResponse) getWebServiceTemplate()
                .marshalSendAndReceive(busca);
        return resultadoBusca;
    }
}
