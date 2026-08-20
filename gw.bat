@echo off
REM Sets JAVA_HOME to Android Studio's JBR for this session, then runs Gradle.
set "JAVA_HOME=C:\Program Files\Android\Android Studio\jbr"
set "PATH=%JAVA_HOME%\bin;%PATH%"
call "%~dp0gradlew.bat" %*
