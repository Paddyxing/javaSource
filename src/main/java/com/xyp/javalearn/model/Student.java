package com.xyp.javalearn.model;

import com.xyp.javalearn.annotation.Length;
import lombok.Data;


import javax.validation.constraints.*;


@Data
public class Student {
    private Integer id;
    @NotNull(message = "姓名不能为空")
    @NotEmpty(message = "空字符串")
    private String name;
    @NotBlank
    private String sex;
    @NotNull
    @Min(value = 0, message = "")
    @Max(value = 100,message = " ccc")
    private Integer score;
    @Length(min = 11,max = 11,errorMsg = "号码长度必须为11位")
    private String mobile;
}
