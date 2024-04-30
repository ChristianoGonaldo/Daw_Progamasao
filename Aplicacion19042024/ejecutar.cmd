@CHCP 65001 > NUL
@ECHO OFF

REM Rev. 20221220000

SET nombre=ControlVista
SET nombrepaquete=jcolonia.daw2023.menuIdeal
SET args=

SET oldpath=%PATH%
SET PATH=c:\java\jdk21\bin;%PATH%
SET CLASSPATH=bin
SET JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF-8

ECHO %jcolonia.daw2023.menuIdeal%.%nombre%
ECHO ---
ECHO.

java %nombrepaquete%.%nombre% %args%

:FIN
ECHO.
SET PATH=%oldpath%
PAUSE
