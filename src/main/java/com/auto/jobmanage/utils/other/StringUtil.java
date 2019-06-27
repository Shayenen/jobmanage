package com.auto.jobmanage.utils.other;

import com.baomidou.mybatisplus.core.toolkit.StringPool;

import java.util.stream.IntStream;

public class StringUtil {
    /**
     * 驼峰转下划线
     *
     * @param value 待转换值
     * @return 结果
     */
    public static String camelToUnderscore(String value) {
        if (org.apache.commons.lang3.StringUtils.isBlank(value))
            return value;
        String[] arr = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(value);
        if (arr.length == 0)
            return value;
        StringBuilder result = new StringBuilder();
        IntStream.range(0, arr.length).forEach(i -> {
            if (i != arr.length - 1)
                result.append(arr[i]).append(StringPool.UNDERSCORE);
            else
                result.append(arr[i]);
        });
        return org.apache.commons.lang3.StringUtils.lowerCase(result.toString());
    }
}
