package com.spring.boot.utils.resultJson;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.Map;

public class ResultJson {
        private Integer code;
        private String message;
        private Object data;
        @JsonIgnore
        private static final Map EMPTY_MAP = new HashMap<>();

        public ResultJson(){}

        public ResultJson(Integer code, String message, Object data){
            this.code = code;
            this.message = message;
            this.data = data;
        }

        public Integer getCode() {
            return code == null ? 0 : code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMessage() {
            return (message == null || message.trim().length() < 1) ? "" : message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Object getData() {
            return data == null ? new Object() : data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public static ResultJson success(Object data){
            if(data == null) return success();
            return new ResultJson(0, "", data);
        }

        public static ResultJson success(){
            return new ResultJson(0, "", EMPTY_MAP);
        }

        public static ResultJson fail(Integer code, String message){
            return new ResultJson(code, message, EMPTY_MAP);
        }

}
