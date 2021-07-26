package io.grpc.grpcswagger.openapi.v2;

import java.util.LinkedHashMap;

import lombok.Data;

/**
 * @author liuzhengyang
 */
@Data
public class Definition {
    private LinkedHashMap<String, DefinitionType> definitionTypeMap;
}
