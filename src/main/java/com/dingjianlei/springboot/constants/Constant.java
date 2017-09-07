package com.dingjianlei.springboot.constants;

public class Constant {
/*验证email是否存在 */
public static final String EMAIL_TYPE="0";
/**验证用户名是否存在**/
public static final String USER_TYPE="1";
/**应答状态 第1位标识 错误还是正确 第2位标识 错误码 0-9 ，0 存在，1 错误格式 2 程序发生异常 3 正常**/
public static final String SUCCESS_CODE="13";
/**失败应答状态 - 要记录**/
/**存在错误码**/
public static final String ERROR_CODE_EXISIS="01";
/**程序异常错误码**/
public static final String ERROR_CODE_EXCEPTION="02";
/**邮箱存在返回前端页面显示**/
public static final String ERROR_EMAIL_EXISIS="该邮箱已经存在";
/**用户名存在**/
public static final String ERROR_USERNAME_EXISIS="该用户名已经存在";
/**程序发生异常页面显示**/
public static final String ERROR_EXCEPTION="程序发生异常";
}
