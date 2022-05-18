for /d %%D in (*) do (
	set "TRUE="
	if  %%~nxD == bin set TRUE=1
	if  %%~nxD == .vscode set TRUE=1
	if  %%~nxD == lib set TRUE=1
	if  %%~nxD == javadoc set TRUE=1
	if not defined TRUE (
		javac --module %%~nxD -d bin --module-source-path .\*\src\ -cp .\lib\*.jar
	)
)

java -cp "lib\\mysql-connector-java-8.0.29.jar" --module-path .\bin --module com.institutmvm.controller/com.institutmvm.controller.ui.App