package com.spring.boot.utils;

public class ObjectMapperUtil {
	private static ObjectMapperConfig mapper = new ObjectMapperConfig();

	public static ObjectMapperConfig getJsonMapper() {
		return mapper;
	}

    public static String toJsonString(Object object){
        try{
            return mapper.writeValueAsString(object);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
