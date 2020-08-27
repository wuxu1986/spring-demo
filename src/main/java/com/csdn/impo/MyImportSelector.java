package com.csdn.impo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 想要找的配置文件
        return new String[]{"com.csdn.domain.Student"};
    }
}
