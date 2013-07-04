#!/bin/bash


#ECLIPSE_HOME=${ECLIPSE_BASE:-}
ECLIPSE_BASE=%{P2_PATH}

cd ${ECLIPSE_BASE}

#%{os_name}
#%{os_family}
#%{os_arch}
#%{os_ws}
#macosx
#

case $1 in
install)

mkdir -p %{CC_PATH}

#    offer a debug option to the p2 installer
#	-consolelog \
#    -debug

./director \
	-data %{USER_HOME}/workspace-chefclipse-%{SCM_BRANCH} \
	-clean \
    -repository http://download.eclipse.org/releases/juno \
	-repository https://github.com/limepepper/p2/raw/master/chefclipse/%{SCM_BRANCH}/update-site \
	-repository  http://download.eclipse.org/tools/orbit/downloads/drops/R20120526062928/repository \
	-installIU org.limepepper.chefclipse.product \
	-tag InitialState \
	-destination %{CC_PATH} \
	-profile chefclipse-%{SCM_BRANCH} \
	-p2.os %{os_name} \
	-p2.ws %{os_ws} \
	-p2.arch %{os_arch} \
	-roaming \
	-bundlepool ~/.p2 \
	-profileProperties org.eclipse.update.install.features=true \
	-vmargs \
	-Declipse.p2.data.area=%{CC_PATH}/p2 \
	-Xms128M \
	-Xmx256M \
	-XX:PermSize=128M \
	-XX:MaxPermSize=256M


;;
list-UI)


${ECLIPSE_BASE}/director -list \
-noSplash \
-application org.eclipse.equinox.p2.director \
-repository http://andrei.gmxhome.de/eclipse/


;;
list-products)


${ECLIPSE_BASE}/director \
-noSplash \
-application org.eclipse.equinox.p2.director \
-repository https://github.com/limepepper/p2/raw/master/chefclipse/%{SCM_BRANCH}/update-site \
-listInstalledRoots


;;
esac


