package com.validator;

import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface Ivalidator {
	public Map<String,String> validate( Map<String,String> errorMap);
	
	default Ivalidator andThen(Ivalidator after) {
        Objects.requireNonNull(after);
        return (t) -> after.validate(validate(t));
    }
}
