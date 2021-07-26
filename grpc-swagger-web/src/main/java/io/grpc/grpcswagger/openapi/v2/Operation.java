package io.grpc.grpcswagger.openapi.v2;

import java.util.Collections;
import java.util.List;
import java.util.SortedMap;

import lombok.Data;

/**
 * @author liuzhengyang
 */
@Data
class Operation {
    private String description;
    private String operationId;
    private List<Parameter> parameters;
    private SortedMap<String, ResponseObject> responses;
    private List<String> schemes = Collections.singletonList("http");
    private List<String> produces = Collections.singletonList("application/json");
    private List<String> consumes = Collections.singletonList("application/json");
}
