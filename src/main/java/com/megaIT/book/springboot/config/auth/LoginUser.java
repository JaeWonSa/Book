package com.megaIT.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)  // 생성될 수 있는 위치를 지정 PARAMETER(인자)
@Retention(RetentionPolicy.RUNTIME) // RUNTIME시 실행
public @interface LoginUser {   // @


}
