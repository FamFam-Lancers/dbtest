package com.example.dbtest.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {UserInfoExistsValidator.class})
@ReportAsSingleViolation
public @interface UserInfoExists {
    String message() default "{userinfoexists}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target(FIELD)
    @Retention(RUNTIME)
    @Documented
    public static @interface List {
        UserInfoExists[] value();
    }

}
