# AndroidHttp
Android网络请求，Retrofit+Rxjava+Okhttp。
***
#### 简述：
这是一个我自己用了将近一年的网络封装，基本上是根据项目要求调整的一个网络请求，目前用起来已经挺顺手了，在此纪录一下，方便以后使用，同时也欢迎大家提供指导意见，共同进步。
***
#### 使用时需要注意的地方：
##### 1.网络配置
  在AndroidManifest.xml文件中添加
  ```
  <uses-permission android:name="android.permission.INTERNET" />
  ```
  Android9以上需要配置networkSecurityConfig  
  ①在AndroidManifest.xml文件的application下添加  
  ```
  android:networkSecurityConfig="@xml/network_security_config"
  ```
  ②在res->建立xml文件夹->建立network_security_config.xml文件  
  ③在network_security_config.xml文件中添加
  ```
  <?xml version="1.0" encoding="utf-8"?>
  <network-security-config>
    <base-config cleartextTrafficPermitted="true" />
  </network-security-config>
  ```
##### 2.框架添加
  在build.gradle中添加上引用的第三方
  ```
    /*网络请求*/
    implementation 'com.squareup.retrofit2:retrofit:2.6.1'
    implementation 'io.reactivex.rxjava2:rxandroid:2.1.0'
    implementation 'io.reactivex.rxjava2:rxjava:2.2.12'
    implementation 'com.squareup.retrofit2:converter-gson:2.3.0'
    implementation 'com.squareup.retrofit2:adapter-rxjava2:2.6.0'
    implementation 'com.squareup.retrofit2:converter-jackson:2.6.1'
    /*gson*/
    implementation 'com.google.code.gson:gson:2.8.6'
    /*loading*/
    implementation 'com.wang.avi:library:2.1.3'
   ```
##### 3.混淆文件
   在proguard-rules.pro文件中添加混淆代码，特别注意TODO包名更换的地方
```
   #okhttp3
    -dontwarn com.squareup.okhttp3.**
    -keep class com.squareup.okhttp3.** { *;}
    -dontwarn okio.**

    #retrofit2
    -dontwarn retrofit2.**
    -keep class retrofit2.** { *; }
    -keepattributes Signature
    -keepattributes Exceptions

    #rxjava&&rxandroid
    -dontwarn sun.misc.**
    -keepclassmembers class rx.internal.util.unsafe.*ArrayQueue*Field* {
        long producerIndex;
        long consumerIndex;
    }
    -keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef {
        rx.internal.util.atomic.LinkedQueueNode producerNode;
    }
    -keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef {
        rx.internal.util.atomic.LinkedQueueNode consumerNode;
    }

    #gson
    -keep class com.google.gson.** {*;}
    -keep class com.google.**{*;}
    -keep class sun.misc.Unsafe { *; }
    -keep class com.google.gson.stream.** { *; }
    -keep class com.google.gson.examples.android.model.** { *; }

    # TODO 换包名  保留实体类和成员不被混淆(根据具体情况修改bean的路径)
    -keep class com.elaine.androidhttp.bean.**{*;}

    #loading
    -keep class com.wang.avi.** { *; }
    -keep class com.wang.avi.indicators.** { *; }
```
##### 4.BaseBean如何构造
服务器返回的数据一般是json格式，一般的数据格式如下：
```
{
     msg:"请求成功";
     code:200;
     data:{"userId":"200001","nickname":"elaine"}
}
```
根据BaseBean返回的数据格式进行提取，因为data可能存在的{}格式或者`[{},{}]`格式，所以将data设置为object类型，方便后续解析，比如上图中的一般这样构造BaseBean:
```
public class BaseBean {

    /**
     * msg : 请求成功
     * code : 200
     * data : {"userId":"200001","nickname":"elaine"}
     */

    private String msg;
    private int code;
    private Object data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
```
