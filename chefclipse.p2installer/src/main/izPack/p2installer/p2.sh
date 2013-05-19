#!/bin/bash


#ECLIPSE_HOME=${ECLIPSE_BASE:-}
ECLIPSE_BASE=%{P2_PATH}

cd ${ECLIPSE_BASE}

case $1 in
install)

mkdir -p %{CC_PATH}

./director \
	-data %{USER_HOME}/workspace-chefclipse-%{SCM_BRANCH} \
	-consolelog -clean \
	-repository https://github.com/limepepper/p2/raw/master/chefclipse/%{SCM_BRANCH}/update-site \
	-repository  http://download.eclipse.org/tools/orbit/downloads/drops/R20120526062928/repository \
	-installIU org.limepepper.chefclipse.product \
	-tag InitialState \
	-destination %{CC_PATH} \
	-profile chefclipse-%{SCM_BRANCH} \
	-p2.os linux \
	-p2.ws gtk \
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

list-thing)

${ECLIPSE_BASE}/director -list \
-noSplash \
-application \
org.eclipse.equinox.p2.director \
-repository \
https://hudson.eclipse.org/hudson/job/gef-zest-integration/lastSuccessfulBuild/artifact/targetPlatform/

;;
list-repo)


${ECLIPSE_BASE}/director -list \
-noSplash \
-application \
org.eclipse.equinox.p2.director \
-repository \
${2}

;;
list-roots)

${ECLIPSE_BASE}/eclipse -noSplash -application org.eclipse.equinox.p2.director -listInstalledRoots

;;
console)

eclipse -console -noSplash -noExit -vmargs -Declipse.application.launchDefault=false

#provaddrepo http://download.eclipse.org/eclipse/updates/3.7-I-builds
#osgi> provlpquery * "select(parent | parent.properties['org.eclipse.equinox.p2.type.group'] == true 
#   && parent.requirements.exists(rc | everything.exists(iu | iu ~= rc && 
#       iu.id == 'BUNDLEID')))" true

#For wildcards one may use:

#osgi> provlpquery * "select(parent | parent.properties['org.eclipse.equinox.p2.type.group'] == true 
#   && parent.requirements.exists(rc | everything.exists(iu | iu ~= rc && 
#       iu.id ~= /*BUNDLEID*/)))" true

;;
gc)


eclipse -application org.eclipse.equinox.p2.garbagecollector.application -profile SDKProfile

;;
*)

echo "not found command"

;;

esac


exit 0

eclipse \
-application org.eclipse.equinox.p2.director \
-noSplash \
-repository \
http://download.eclipse.org/releases/juno \
-tag \
$(date +%s) \
-installIUs \
org.eclipse.dltk.ruby


java -jar plugins/org.eclipse.equinox.launcher_1.3.0.v20120522-1813.jar \
    -application  org.eclipse.update.core.standaloneUpdate \
    -command update
    
    
    
    Uninstalling a specified feature:
java -jar plugins/org.eclipse.equinox.launcher_<version>.jar
    -application  org.eclipse.update.core.standaloneUpdate
    -command uninstall
    -featureId feature_id 
    -version version 
    [-to target_site_dir] 


eclipse -clean


./eclipse -console -noexit

#someone suggests..
#rm workspace/.metadata/.plugins/org.eclipse.core.resources/.snap
