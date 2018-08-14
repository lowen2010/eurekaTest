package com.lowen.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户信息实体
 *
 * @author chengwei
 * @date 2018-06-28
 */

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class UserDto {
    private String userId;
    private String userName;
    private String userAge;
}
