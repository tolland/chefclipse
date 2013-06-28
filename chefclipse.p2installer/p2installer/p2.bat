

RMDIR /S /Q "%USERPROFILE%\opt\chefclipse\configuration"
RMDIR /S /Q "%USERPROFILE%\opt\chefclipse\p2"

mkdir  "%USERPROFILE%"\opt\chefclipse\p2
mkdir "%USERPROFILE%"\workspace-chefclipse

rem attrib -r -s -a -H "%USERPROFILE%"\.p2 /S /D 
attrib -r -s -a -H "%USERPROFILE%"\opt\chefclipse /S /D 
attrib -r -s -a -H "%USERPROFILE%"\workspace-chefclipse /S /D 


"%USERPROFILE%\opt\p2installer\director.bat" ^
	-consolelog ^
	-debug ^
	-clean ^
	-repository ^
	https://github.com/limepepper/p2/raw/master/chefclipse/tomhodder/update-site  ^
	-repository ^
	http://download.eclipse.org/tools/orbit/downloads/drops/R20120526062928/repository ^
	-installIU org.limepepper.chefclipse.product  ^
	-tag InitialState  ^
	-destination  "%USERPROFILE%\opt\chefclipse" ^
	-profile SDKProfile  ^
	-p2.os win32  ^
	-p2.ws win32  ^
	-p2.arch %{os_arch} ^
	-roaming ^
	-bundlepool "%USERPROFILE%"\.p2

    
