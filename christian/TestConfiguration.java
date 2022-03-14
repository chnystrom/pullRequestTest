package com.test.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Configuration
@Import({
      LogFileWebEndpointAutoConfiguration.class,
      EndpointAutoConfiguration.class,

      InfoEndpointAutoConfiguration.class,
      HealthEndpointAutoConfiguration.class,

      WebEndpointAutoConfiguration.class,
      ServletManagementContextAutoConfiguration.class,
      ManagementContextAutoConfiguration.class,
})
@EnableConfigurationProperties(CorsEndpointProperties.class)
public class ActuatorConfiguration {

   @Bean
   public WebMvcEndpointHandlerMapping webEndpointServletHandlerMapping(WebEndpointsSupplier webEndpointsSupplier,
         ServletEndpointsSupplier servletEndpointsSupplier, ControllerEndpointsSupplier controllerEndpointsSupplier,
         EndpointMediaTypes endpointMediaTypes, CorsEndpointProperties corsProperties,
         WebEndpointProperties webEndpointProperties) {
      List<ExposableEndpoint<?>> allEndpoints = new ArrayList<>();
   }

}
