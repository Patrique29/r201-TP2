:a
@echo on
javac -d ..\class ..\src\Etudiant.java
javac -d ..\class ..\src\Testudiant.java
java Etudiant
@echo off
pause
CLS
GOTO :a