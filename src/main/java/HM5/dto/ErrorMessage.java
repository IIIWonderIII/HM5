package HM5.dto;

import lombok.Data;

@Data
public class ErrorMessage {
    private Integer status;
    private String message;
    private String timestamp;
}