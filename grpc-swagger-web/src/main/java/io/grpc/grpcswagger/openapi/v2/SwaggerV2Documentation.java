package io.grpc.grpcswagger.openapi.v2;

import java.util.Collections;
import java.util.List;
import java.util.SortedMap;

import lombok.Data;

/**
 * @author liuzhengyang
 */
@Data
public class SwaggerV2Documentation {
    private String swagger = "2.0"; // MAGIC
    private InfoObject info;
    private List<String> produces = Collections.singletonList("application/json");
    private List<String> consumes = Collections.singletonList("application/json");
    private String basePath = "/";
    private String host = "localhost:8088";
    private List<String> schemes = Collections.singletonList("http");
    private SortedMap<String, DefinitionType> definitions;
    private SortedMap<String, PathItem> paths;
}
