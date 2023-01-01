package cn.mapway.ib;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

/**
 * Server Map entry point
 * @author zhangjianshe@gmail.com
 */
public class ServerMain {

    @At(value = {"/index", "/home", "/"}, methods = "GET")
    @Ok("jsp:jsp.index")
    public String home() {
        return "Hello Nutz";
    }
}
