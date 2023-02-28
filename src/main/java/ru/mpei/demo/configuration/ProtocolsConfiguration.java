package ru.mpei.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mpei.demo.model.ProtocolState;
import ru.mpei.demo.model.Type;

@Configuration
public class ProtocolsConfiguration {

    @Bean
    public ProtocolState protoState(){
        ProtocolState ps = new ProtocolState();
        ps.setPType(Type.IEC104);
        return ps;
    }



}
