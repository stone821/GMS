package me.triplestone.goodsmanagesystem;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
/**
 * {@code Goods} - the form-backing bean
 * @author triplestone
 * @version 0.1
 */
public class Goods {
    
    @NotBlank
    @Size(min = 1, max = 50, message = "物料名称长度在1-50个字之间")
    private String name;
    
    @NotBlank
    @Pattern(regexp="^(1?[1-9][0-9]|[1-9])$", message = "数量在1-199之间")
    private short number;

    @NotBlank
    @Size(min = 1, max = 50, message = "类型名称长度在1-50个字之间")
    private String type;

    @NotBlank
    @Size(min = 1, max = 50, message = "项目名称长度在1-50个字之间")
    private String project;
}