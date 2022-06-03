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


### Appender
- destinasi log file yang akan dibuat
- Logback sudah menyediakan banyak sekali appender, jadi sebenarnya kita tidak perlu membuat appender secara manual

#### Console Appender
- Appender yang paling sederhana adalah Console
- appender ini hanya meneruskan log event yang kita kirim menggunakan logger ke dalam console atau System.out
- ConsoleAppender sangat cocok ketika aplikasi yang kita buat di bungkus dalam docker atau kubernetes misalnya,
karena kita cukup menampilkannya di console, dan secara otomatis log bisa diambil oleh docker dan kubernetes


#### File Appender
- FileAppender merupakan appender yang mengirim log event ke file
- FileAppender sangat cocok ketika kita masih menggunakan VM untuk deploy aplikasi  kita
- Jadi semua log event akan disimpan di file

#### Rolling File Appender
- saat menyimpan semua log event di file, lama-lama file tersebut akan terlalu besar
- appender yang menyimpan data nya di file, namun kita bisa lakukan rolling, artinya per waktu tertentu akan dibuatkan file baru
- Selain itu kita bisa juga set maksimal ukuran file nya, sehingga ketika sudah mencapai batas maksimal, akan dibuatkan file baru lagi
- Ini lebih direkomendasikan untuk digunakan dibanding menggunakan FileAppender

