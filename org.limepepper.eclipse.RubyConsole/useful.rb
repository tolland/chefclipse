#
# http://www.artima.com/weblogs/viewpost.jsp?thread=227935

# conversation between eclipse-shell guy and the jruby example guy, and a note on why
# the consooe input is closed
# http://www.artima.com/forums/flat.jsp?forum=106&thread=227935
#

require 'java'

include_class 'org.eclipse.core.resources.ResourcesPlugin'
include_class 'org.eclipse.core.runtime.Platform'
include_class 'org.eclipse.core.resources.IResource'
include_class 'org.limepepper.chefclipse.common.ui.providers.ChefModelProvider'

adapterFactory = new
Platform.getAdapterManager().registerAdapters(adapterFactory, Contact.class);

workspace = ResourcesPlugin.get_workspace

# projects[0].close(0,nil)

# workspace.get_root.get_project('project1').open nil

# projects[0].build(0,nil)

projects = workspace.get_root.get_projects
projects.each { |p|
  puts p.get_name
}

#workspace.methods

