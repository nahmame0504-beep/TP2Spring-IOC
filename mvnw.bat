@echo off
set "JAVA_HOME=C:\Program Files\Java\jdk-21.0.12"
set "PATH=%JAVA_HOME%\bin;%PATH%"
"C:\Program Files\NetBeans 8.0.2\java\maven\bin\mvn.bat" %*
