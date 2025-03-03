package com.tduck.cloud.form.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : smalljop
 * @description : 表单项类型枚举
 * @create : 2020-11-19 10:51
 **/
@AllArgsConstructor
@Getter
public enum FormItemTypeEnum {

    INPUT("单行文本"),
    NUMBER("数字"),
    TEXTAREA("多行文本"),
    SELECT("下拉框"),
    CASCADER("级联选择"),
    SORT("排序"),
    SLIDER("滑块"),
    RADIO("单选框"),
    CHECKBOX("多选框"),
    DATE("日期选择"),
    DATE_RANGE("日期范围"),
    RATE("评分"),
    IMAGE_UPLOAD("图片上传"),
    UPLOAD("文件上传组件"),
    IMAGE("图片展示"),
    IMAGE_SELECT("图片选择"),
    IMAGE_CAROUSEL("图片轮播"),
    DESC_TEXT("文字描述"),
    SIGN_PAD("手写签名"),
    PAGINATION("分页"),
    DIVIDER("分割线"),
    PROVINCE_CITY("省市联动"),
    PHONE_VERIFICATION("手机号验证"),
    SUB_FORM("子表单"),
    INPUT_MAP("地理位置"),
    MATRIX_INPUT("矩阵填空"),
    MATRIX_SCALE("矩阵量表"),
    HORIZONTAL_INPUT("横向填空"),
    MATRIX_SELECT("矩阵选择");

    private String desc;


}
