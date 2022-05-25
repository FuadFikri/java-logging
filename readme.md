## Java Logging
    source : programmer zaman now

### Level
- error
- warn
- info
- debug
- trace
- secara default, logback hanya menampilkan level debug keatas

### Method
- level(String)
- level(String, Object)
- level(String, Throwable)


### COnfiguration
- defaultnya kita tidak membutuhkan configration saat menggunakan logback
- namun misal kita ingin menjalankan logging samapai level trace atau ketika production kita hanya membutuhkan samapi level warning
- maka kita perlu membuat file konfigurasi
- Secara default, saat kita membuat file konfigurasi, logback akan membaca level yang harus dikeluarkan dari file logback
- buat file logback.xml di default package

```
<configuration>
  <root level="debug">
    <appender class="ch.qos.logback.core.ConsoleAppender">
      <encoder>
        <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
      </encoder>
    </appender>
  </root>
</configuration>
```
