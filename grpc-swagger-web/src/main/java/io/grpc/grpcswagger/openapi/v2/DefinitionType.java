package io.grpc.grpcswagger.openapi.v2;

import java.util.LinkedHashMap;

import lombok.Data;

/**
 * @author liuzhengyang
 */
@Data
public class DefinitionType {
    private String type;
    private String format;
    private String title;
    private LinkedHashMap<String, FieldProperty> properties;
}
