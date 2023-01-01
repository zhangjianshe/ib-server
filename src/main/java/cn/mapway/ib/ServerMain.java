package cn.mapway.ib;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

/**
 * Server Map entry point
 * @Modules - 声明应用的所有子模块 @Modules(scanPackage = true) //1.r.58开始默认就是true
 * @IocBy - 设置应用所采用的 Ioc 容器
 * @SetupBy - 应用启动以及关闭时的额外处理
 * @Views - 自定义的扩展视图
 * @Localization - 应用的本地化字符串设定
 * - 自定义Session实现
 * 所有入口函数上支持的注解
 * 声明在主模块模块的注解，将作为所有入口函数的默认配置
 * 在子模块中的定义更为优先
 * @author zhangjianshe@gmail.com
 */
public class ServerMain {

    /**
     * 关于 模式匹配和配置参考
     * http://www.nutzam.com/core/mvc/url_mapping.html
     * @return
     */
    @At(value = {"/index", "/home", "/"}, methods = "GET")
    @Ok("jsp:jsp.index")
    public String home() {
        return "geo cache @mapway.cn";
    }
}
