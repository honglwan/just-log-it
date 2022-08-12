package com.honglwan.justlogit.config;

import com.honglwan.justlogit.props.JustLogItProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * JustLogItAutoConfiguration
 *
 * @author honglwan
 */
@Configuration
@EnableConfigurationProperties(JustLogItProperties.class)
public class JustLogItAutoConfiguration {
}
