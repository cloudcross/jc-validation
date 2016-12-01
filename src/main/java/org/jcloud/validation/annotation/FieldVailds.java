package org.jcloud.validation.annotation;

import org.jcloud.validation.enums.annotation.FieldVaildType;

import java.lang.annotation.*;

/**
 * 字段校验
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)  //作用于字段上
public @interface FieldVailds {

    public FieldVaildType type() default FieldVaildType.VAILD_ANY;
}
