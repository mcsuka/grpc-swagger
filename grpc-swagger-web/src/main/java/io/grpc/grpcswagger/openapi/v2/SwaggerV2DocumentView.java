package io.grpc.grpcswagger.openapi.v2;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Jikai Zhang
 * @date 2019-08-25
 */
public class SwaggerV2DocumentView {
    
    private final SwaggerV2Documentation documentation;
    private final String serviceName;
    
    public SwaggerV2DocumentView(String serviceName, SwaggerV2Documentation documentation) {
        this.documentation = documentation;
        this.serviceName = serviceName;
    }
    
    public String getSwagger() {
        return documentation.getSwagger();
    }
    
    public InfoObject getInfo() {
        return documentation.getInfo();
    }
    
    public List<String> getProduces() {
        return documentation.getProduces();
    }
    
    public List<String> getConsumes() {
        return documentation.getConsumes();
    }
    
    public String getBasePath() {
        return documentation.getBasePath();
    }
    
    public String getHost() {
        return documentation.getHost();
    }
    
    public List<String> getSchemes() {
        return documentation.getSchemes();
    }
    
    public Map<String, DefinitionType> getDefinitions() {
        return documentation.getDefinitions();
    }
    
    public SortedMap<String, PathItem> getPaths() {
        if (StringUtils.isBlank(serviceName)) {
            return documentation.getPaths();
        }
        return documentation.getPaths()
                .entrySet()
                .stream()
                .filter(e -> e.getKey().contains(serviceName + "."))
                .collect(TreeMap::new,
                        (map, item) -> map.put(item.getKey(), item.getValue()),
                        TreeMap::putAll);
    }
}
