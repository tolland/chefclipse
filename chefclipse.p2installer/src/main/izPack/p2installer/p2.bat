

RMDIR /S /Q "%{CC_PATH}\configuration"
RMDIR /S /Q "%{CC_PATH}\p2"

mkdir  "%{CC_PATH}\p2
mkdir "%USERPROFILE%"\workspace-chefclipse=%{SCM_BRANCH}

rem attrib -r -s -a -H "%USERPROFILE%"\.p2 /S /D 
attrib -r -s -a -H "%USERPROFILE%"\opt\chefclipse /S /D 
attrib -r -s -a -H "%USERPROFILE%"\workspace-chefclipse /S /D 


"%{P2_PATH}\director.bat" ^
	-consolelog ^
	-debug ^
	-clean ^
	-repository ^
	https://github.com/limepepper/p2/raw/master/chefclipse/%{SCM_BRANCH}/update-site  ^
	-repository ^
	http://download.eclipse.org/tools/orbit/downloads/drops/R20120526062928/repository ^
	-installIU org.limepepper.chefclipse.product  ^
	-tag InitialState  ^
	-destination  "%{CC_PATH}" ^
	-profile SDKProfile  ^
	-p2.os win32  ^
	-p2.ws win32  ^
	-p2.arch %{os_arch} ^
	-roaming ^
	-bundlepool "%USERPROFILE%"\.p2

    
